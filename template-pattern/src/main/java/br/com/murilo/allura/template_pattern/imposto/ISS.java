package br.com.murilo.allura.template_pattern.imposto;

import br.com.murilo.allura.template_pattern.orcamento.Orcamento;

public class ISS implements Imposto {

	@Override
	public Double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
