package br.com.murilo.allura.strategy_exercise.perfis;

import java.util.Random;

import br.com.murilo.allura.strategy_exercise.investidor.Investidor;

public class Moderado implements Perfil {

	private Random random;

	public Moderado() {
		this.random = new Random();
	}
	
	@Override
	public Double calcular(Investidor investidor) {
		Double saldo = investidor.getSaldo();
		if(random.nextInt(2) == 0) {
			return saldo * 0.025;
		}else {
			return saldo * 0.007;
		}
	}

}
