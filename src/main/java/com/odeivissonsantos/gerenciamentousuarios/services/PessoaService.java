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
	
	public Pessoa verifyIfExists(Long id) throws PessoaNotFoundException {
		return repository.findById(id).orElseThrow(() -> new PessoaNotFoundException(id));
	}
	
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
		Pessoa pessoa = verifyIfExists(id);
		
		return pessoa;
	}



	public void delete(Long id) throws PessoaNotFoundException {
		verifyIfExists(id);
		repository.deleteById(id);
		
	}
	
	public void updateById(Long id, Pessoa pessoaAtualizada) throws PessoaNotFoundException {
		verifyIfExists(id);
		pessoaAtualizada.setId(id);

		
	repository.save(pessoaAtualizada);
		
	}

}
