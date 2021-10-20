package com.everis.Api2.Service;

import com.everis.Api2.ContaRepository.ContaRepository;
import com.everis.Api2.ContaRepository.OperacaoRepository;
import com.everis.Api2.Dto.Evento;
import com.everis.Api2.Enun.ETipoEvento;
import com.everis.Api2.Model.Conta;
import com.everis.Api2.Model.Operacao;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
public class ConsumerService {

    @Autowired
    private ContaRepository contaRepository;

    @Autowired
    private OperacaoRepository operacaoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ObjectMapper objectMapper;

    @KafkaListener(topics = "BANK_NEW_SAQUE")
    public void listening(String msg) throws Exception {
        Evento evento = objectMapper.readValue(msg, Evento.class);

        if (evento.getTipoEvento() == ETipoEvento.SAQUE_EFETUADO) {
            Operacao operacao = modelMapper.map(evento, Operacao.class);
            operacaoRepository.save(operacao);
        }
        if (evento.getTipoEvento() == ETipoEvento.CONTA_CRIADA) {
            Conta conta = modelMapper.map(evento, Conta.class);
            contaRepository.save(conta);
        }
    }

    public Long getQuantidadeDeSaque(Long numeroDaConta) {
        Long quantidadeDisponivel = 0L;

        Conta conta = contaRepository.findContaByNumeroDaConta(numeroDaConta);

        LocalDateTime dataAtual = LocalDateTime.now();
        LocalDateTime dataInicial = LocalDateTime.of(dataAtual.getYear(), dataAtual.getMonth(), 1, 0, 0, 0, 0);

        long quantidadeDeSaque = operacaoRepository.getTotalSaquesBetween(numeroDaConta, Timestamp.valueOf(dataInicial), Timestamp.valueOf(dataAtual));

        if (quantidadeDeSaque > conta.getQuantidadeSaque()) {
            conta.setQuantidadeSaque(0L);
        } else {
            quantidadeDisponivel = conta.getQuantidadeSaque() - quantidadeDeSaque;
        }
        return quantidadeDisponivel;
    }
}
