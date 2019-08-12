package br.com.murilo.allura.chain_of_responsability.desconto;

import br.com.murilo.allura.strategy_pattern.orcamento.Orcamento;

public class DescontoPorMaisDeQuinhetosReais implements Desconto {

	private Desconto proximo;

	@Override
	public Double desconto(Orcamento orcamento) {
		if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		}

		return proximo.desconto(orcamento);
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		this.proximo = proximo;		
	}

}
