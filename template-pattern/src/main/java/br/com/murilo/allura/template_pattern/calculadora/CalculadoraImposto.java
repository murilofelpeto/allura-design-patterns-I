package br.com.murilo.allura.template_pattern.calculadora;

import br.com.murilo.allura.template_pattern.imposto.Imposto;
import br.com.murilo.allura.template_pattern.orcamento.Orcamento;

public class CalculadoraImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		Double valor = imposto.calculaImposto(orcamento);
		System.out.println(valor);
	}
}
