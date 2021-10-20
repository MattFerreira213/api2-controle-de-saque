package com.everis.Api2.Service;

import com.everis.Api2.ContaRepository.ContaRepository;
import com.everis.Api2.Model.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SacarService {

//    @Autowired
//    private Conta conta;
//
//    @Autowired
//    private ContaRepository contaRepository;
//
//    public String retornarQuantidadeSaques(Long numeroDaConta){
//        var conta = Optional.ofNullable(contaRepository.findContaByNumeroConta(numeroDaConta));
//        if (conta.isPresent()){
//            conta.map(map -> {
//                map.setQuantidadeSaquesGratuitos(map.getQuantidadeSaquesGratuitos() != null ? map.getQuantidadeSaquesGratuitos() + 1 : 1);
//                Conta update = contaRepository.save(map);
//
//                return ResponseEntity.ok().body(update);
//            });
//            return " "+ResponseEntity.ok();
//        }else{
//            return "Conta não encontrada "+ResponseEntity.badRequest();
//        }
//    }
}
