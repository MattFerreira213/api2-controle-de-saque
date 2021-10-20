package com.everis.Api2.Model;

import com.everis.Api2.Enun.ETipoConta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.security.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private Long numeroDaConta;

    @Enumerated(EnumType.STRING)
    private ETipoConta tipoDeConta;

    private Long quantidadeSaque;

}
