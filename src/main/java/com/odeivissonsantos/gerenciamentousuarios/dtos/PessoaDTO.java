package com.odeivissonsantos.gerenciamentousuarios.dtos;

import java.util.List;

import com.odeivissonsantos.gerenciamentousuarios.model.Telefone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {

	
	private Long id;
	
	
	private String nome;
	
	
	private String sobrenome;
	
	
	private String cpf;
	
	
	private String aniversario;
	
	
	private List<Telefone> telefones;
}
