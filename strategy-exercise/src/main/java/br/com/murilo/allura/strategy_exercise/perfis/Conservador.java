package br.com.murilo.allura.strategy_exercise.perfis;

import br.com.murilo.allura.strategy_exercise.investidor.Investidor;

public class Conservador implements Perfil {

	@Override
	public Double calcular(Investidor investidor) {
		return investidor.getSaldo() * 0.008;
	}

}
