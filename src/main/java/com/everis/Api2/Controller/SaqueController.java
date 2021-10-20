package com.everis.Api2.Controller;

import com.everis.Api2.Dto.QuantSaque;
import com.everis.Api2.Service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaqueController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/saque/{numeroDaConta}")
    public QuantSaque retornarQuantidadeDeSaque(@PathVariable Long numeroDaConta){
        Long quantidadeDeSaque = consumerService.getQuantidadeDeSaque(numeroDaConta);
        return new QuantSaque(quantidadeDeSaque);
    }
}
