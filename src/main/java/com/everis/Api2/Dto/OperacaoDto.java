package com.everis.Api2.Dto;

import com.everis.Api2.Enun.ETipoEvento;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class OperacaoDto {

    private Long numeroDaConta;

    private ETipoEvento tipoEvento;

    private Timestamp dataEvento;

}
