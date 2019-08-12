package br.com.murilo.allura.strategy_exercise.investidor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Investidor {

	private Double saldo;

	public void deposita(Double valor) {
		this.saldo += valor;
	}
}
