package com.odeivissonsantos.gerenciamentousuarios.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


import com.odeivissonsantos.gerenciamentousuarios.dtos.PessoaDTO;
import com.odeivissonsantos.gerenciamentousuarios.model.Pessoa;
import com.odeivissonsantos.gerenciamentousuarios.repositorys.PessoaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PessoaService {
	
	private final PessoaRepository repository;
	
	
	
	public void createPessoa(PessoaDTO pessoaDTO){
		Pessoa pessoaSave = Pessoa.builder()
				.nome(pessoaDTO.getNome())
				.cpf(pessoaDTO.getCpf())
				.sobrenome(pessoaDTO.getSobrenome())
				.telefones(pessoaDTO.getTelefones())
				.build();
		
		repository.save(pessoaSave);
	}



	public List<Pessoa> listAll() {
		return repository.findAll();
	}

}
