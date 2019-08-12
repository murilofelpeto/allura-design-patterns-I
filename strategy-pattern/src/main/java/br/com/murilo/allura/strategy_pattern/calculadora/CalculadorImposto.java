package br.com.murilo.allura.strategy_pattern.calculadora;

import br.com.murilo.allura.strategy_pattern.imposto.Imposto;
import br.com.murilo.allura.strategy_pattern.orcamento.Orcamento;

public class CalculadorImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		Double valor = imposto.calculaImposto(orcamento);
		System.out.println(valor);
	}
}
