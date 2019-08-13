package br.com.murilo.allura.template_exercise.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Conta {

	private String titular;
	private String agencia;
	private String numeroConta;
	private Double saldo;
}
