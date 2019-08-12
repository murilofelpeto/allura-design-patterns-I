package br.com.murilo.allura.chain_of_responsability.desconto;

import br.com.murilo.allura.strategy_pattern.orcamento.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public Double desconto(Orcamento orcamento) {
		return 0.0;
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {}

}
