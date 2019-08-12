package br.com.murilo.allura.strategy_exercise.calculadora;

import br.com.murilo.allura.strategy_exercise.investidor.Investidor;
import br.com.murilo.allura.strategy_exercise.perfis.Perfil;

public class CalcularInvestimento {

	public void calculaInvestimento(Investidor investidor, Perfil perfil) {
		Double resultado = perfil.calcular(investidor);
		investidor.deposita(resultado * 0.75);
		
		System.out.println("Novo saldo é R$ " + investidor.getSaldo());
	}
}
