package com.odeivissonsantos.gerenciamentousuarios.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odeivissonsantos.gerenciamentousuarios.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
