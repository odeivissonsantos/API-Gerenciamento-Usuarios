package com.odeivissonsantos.gerenciamentousuarios.enums;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public enum TipoTelefone {
	
	CASA("Casa"),
	CELULAR("Celular"),
	COMERCIAL("Comercial");
	
	private final String descricao;

	public String getDescricao() {
		return descricao;
	}
	
	

}
