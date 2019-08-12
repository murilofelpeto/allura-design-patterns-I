package br.com.murilo.allura.chain_of_responsability.desconto;

import br.com.murilo.allura.strategy_pattern.orcamento.Orcamento;

public interface Desconto {

	public Double desconto(Orcamento orcamento);
	void setProximoDesconto(Desconto proximo);
}
