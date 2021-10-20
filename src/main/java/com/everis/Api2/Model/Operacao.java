package com.everis.Api2.Model;

import com.everis.Api2.Enun.ETipoEvento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Operacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long numeroDaConta;

    @Enumerated(EnumType.STRING)
    private ETipoEvento tipoEvento;

    private Timestamp dataEvento;
}
