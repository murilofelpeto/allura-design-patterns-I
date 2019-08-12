package br.com.murilo.allura.strategy_exercise;

import br.com.murilo.allura.strategy_exercise.calculadora.CalcularInvestimento;
import br.com.murilo.allura.strategy_exercise.investidor.Investidor;
import br.com.murilo.allura.strategy_exercise.perfis.Arrojado;
import br.com.murilo.allura.strategy_exercise.perfis.Perfil;

public class App {
	public static void main(String[] args) {
		Investidor investidor = new Investidor(100.00);
		Perfil perfil = new Arrojado();
		CalcularInvestimento calcularInvestimento = new CalcularInvestimento();
		
		calcularInvestimento.calculaInvestimento(investidor, perfil);
	}
}
