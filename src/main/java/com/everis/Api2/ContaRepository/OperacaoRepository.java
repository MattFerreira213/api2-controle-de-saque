package com.everis.Api2.ContaRepository;

import com.everis.Api2.Model.Operacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;


public interface OperacaoRepository extends JpaRepository<Operacao, Long> {

    @Query("select count(*) from #{#entityName} op where op.numeroDaConta= ?1 AND op.tipoEvento = 'SAQUE_EFETUADO' AND op.dataEvento between ?2 and ?3")
    long getTotalSaquesBetween (Long numeroDaConta, Timestamp dataInicial, Timestamp dataFinal);
}
