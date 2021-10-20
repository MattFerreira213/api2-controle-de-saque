package com.everis.Api2.ContaRepository;

import com.everis.Api2.Model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

    Conta findContaByNumeroDaConta(Long numeroDaConta);
}
