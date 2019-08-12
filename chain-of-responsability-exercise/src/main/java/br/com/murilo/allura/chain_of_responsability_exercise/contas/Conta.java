package br.com.murilo.allura.chain_of_responsability_exercise.contas;

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
	private Double saldo;
}
