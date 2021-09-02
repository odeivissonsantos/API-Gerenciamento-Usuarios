package com.odeivissonsantos.gerenciamentousuarios.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odeivissonsantos.gerenciamentousuarios.model.Pessoa;
import com.odeivissonsantos.gerenciamentousuarios.repositorys.PessoaRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/pessoas")
public class PessoaController {
	
	private final PessoaRepository repository;
	
	@PostMapping
	public ResponseEntity<Pessoa> createPessoa(@RequestBody Pessoa pessoa){
		return ResponseEntity.ok().body(repository.save(pessoa));
	}
	

}
