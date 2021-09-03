package com.odeivissonsantos.gerenciamentousuarios.services.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PessoaNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PessoaNotFoundException (Long id) {
		super("Pessoa não encontrada: " + id);
	}

}
