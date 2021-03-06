package com.odeivissonsantos.gerenciamentousuarios.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odeivissonsantos.gerenciamentousuarios.dtos.PessoaDTO;
import com.odeivissonsantos.gerenciamentousuarios.model.Pessoa;
import com.odeivissonsantos.gerenciamentousuarios.services.PessoaService;
import com.odeivissonsantos.gerenciamentousuarios.services.exception.PessoaNotFoundException;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/pessoas")
public class PessoaController {
	
	private final PessoaService service;
	
	@PostMapping
	public ResponseEntity<Pessoa> createPessoa(@RequestBody PessoaDTO pessoaDTO){
			service.createPessoa(pessoaDTO);
		return ResponseEntity.created(null).build();
	}
	
	
	@GetMapping
	public List<Pessoa> listAll() {
		return service.listAll();
		
	}
	
	@GetMapping("/{id}")
	public Pessoa findById(@PathVariable Long id) throws PessoaNotFoundException {
		return service.findById(id);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) throws PessoaNotFoundException {
		service.delete(id);
	}
	
	
	@PutMapping("/{id}") 
	public ResponseEntity<Void> updateById(@PathVariable Long id, @RequestBody Pessoa pessoaAtualizada) throws PessoaNotFoundException {
		service.updateById(id, pessoaAtualizada);
		return ResponseEntity.noContent().build();
	}
	

}
