package com.odeivissonsantos.gerenciamentousuarios.services;

import org.springframework.stereotype.Service;

import com.odeivissonsantos.gerenciamentousuarios.model.Pessoa;
import com.odeivissonsantos.gerenciamentousuarios.repositorys.PessoaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PessoaService {
	
	private final PessoaRepository repository;
	
	public Pessoa createPessoa(Pessoa pessoa){
		return repository.save(pessoa);
	}

}
