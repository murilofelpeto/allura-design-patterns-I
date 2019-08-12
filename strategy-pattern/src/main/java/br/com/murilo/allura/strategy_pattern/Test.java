package br.com.murilo.allura.strategy_pattern;

import br.com.murilo.allura.strategy_pattern.calculadora.CalculadorImposto;
import br.com.murilo.allura.strategy_pattern.imposto.ICCC;
import br.com.murilo.allura.strategy_pattern.imposto.ICMS;
import br.com.murilo.allura.strategy_pattern.imposto.ISS;
import br.com.murilo.allura.strategy_pattern.imposto.Imposto;
import br.com.murilo.allura.strategy_pattern.orcamento.Orcamento;

public class Test {

	public static void main(String[] args) {
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento();
		orcamento.setValor(100.00);
		
		CalculadorImposto calculadora = new CalculadorImposto();
		calculadora.realizaCalculo(orcamento, icms);
		calculadora.realizaCalculo(orcamento, iss);
		calculadora.realizaCalculo(orcamento, iccc);

	}

}
