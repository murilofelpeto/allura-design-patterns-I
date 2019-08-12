package br.com.murilo.allura.strategy_pattern.imposto;

import br.com.murilo.allura.strategy_pattern.orcamento.Orcamento;

public class ICMS implements Imposto{

	@Override
	public Double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
}
