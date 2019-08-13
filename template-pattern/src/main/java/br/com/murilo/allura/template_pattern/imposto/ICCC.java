package br.com.murilo.allura.template_pattern.imposto;

import br.com.murilo.allura.template_pattern.orcamento.Orcamento;

public class ICCC implements Imposto {

	@Override
	public Double calculaImposto(Orcamento orcamento) {
		Double valor = orcamento.getValor();

		if (orcamento.getValor() < 1000.00) {
			return valor * 0.05;
		} else if (valor >= 1000.00 && valor <= 3000.00) {
			return valor * 0.07;
		} else {
			return (valor * 0.08) + 30.00;
		}
	}

}
