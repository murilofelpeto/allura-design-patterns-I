package br.com.murilo.allura.strategy_exercise.perfis;

import java.util.Random;

import br.com.murilo.allura.strategy_exercise.investidor.Investidor;

public class Arrojado implements Perfil {

	private Random random;
	
	public Arrojado() {
		this.random = new Random();
	}
	
	@Override
	public Double calcular(Investidor investidor) {
		Double saldo = investidor.getSaldo();
		Integer chute = random.nextInt(10);
		if(chute >= 0 && chute <= 1) {
			return saldo * 0.05;
		}else if(chute >= 2 && chute <= 4) {
			return saldo * 0.03;
		}else {
			return saldo * 0.006;
		}
			
	}

}
