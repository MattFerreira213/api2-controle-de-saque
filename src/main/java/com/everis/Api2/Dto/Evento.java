package com.everis.Api2.Dto;

import com.everis.Api2.Enun.ETipoConta;
import com.everis.Api2.Enun.ETipoEvento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evento {

    private Long numeroDaConta;

    @Enumerated(EnumType.STRING)
    private ETipoConta tipoDeConta;

    @Enumerated(EnumType.STRING)
    private ETipoEvento tipoEvento;

    private Long quantidadeSaque;

    private Timestamp dataEvento;
}
