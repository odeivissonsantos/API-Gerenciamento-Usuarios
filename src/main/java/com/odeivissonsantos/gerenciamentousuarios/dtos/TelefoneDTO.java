package com.odeivissonsantos.gerenciamentousuarios.dtos;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.odeivissonsantos.gerenciamentousuarios.enums.TipoTelefone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelefoneDTO {


	private Long id;
	
	@Enumerated(EnumType.STRING)
	private TipoTelefone tipo;
	

	private String numero;
}
