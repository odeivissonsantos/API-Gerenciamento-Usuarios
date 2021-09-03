package com.odeivissonsantos.gerenciamentousuarios.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.odeivissonsantos.gerenciamentousuarios.dtos.PessoaDTO;
import com.odeivissonsantos.gerenciamentousuarios.model.Pessoa;
import com.odeivissonsantos.gerenciamentousuarios.repositorys.PessoaRepository;
import com.odeivissonsantos.gerenciamentousuarios.services.exception.PessoaNotFoundException;

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



	public Pessoa findById(Long id) throws PessoaNotFoundException {
		Pessoa pessoa = repository.findById(id).orElseThrow(() -> new PessoaNotFoundException(id));
		
		return pessoa;
	}

}
