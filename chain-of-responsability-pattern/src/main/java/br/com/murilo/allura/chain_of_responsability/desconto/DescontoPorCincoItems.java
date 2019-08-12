package br.com.murilo.allura.chain_of_responsability.desconto;

import br.com.murilo.allura.strategy_pattern.orcamento.Orcamento;

public class DescontoPorCincoItems implements Desconto{

	private Desconto proximo;

	@Override
	public Double desconto(Orcamento orcamento) {
		if (orcamento.getItems().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		return proximo.desconto(orcamento);
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		this.proximo = proximo;		
	}
}
