package br.com.murilo.allura.chain_of_responsability.desconto;

import java.util.List;

import br.com.murilo.allura.strategy_pattern.orcamento.Item;
import br.com.murilo.allura.strategy_pattern.orcamento.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public Double desconto(Orcamento orcamento) {
		if (contemItem(orcamento.getItems(), "LAPIS") && contemItem(orcamento.getItems(), "CANETA")) {
			return orcamento.getValor() * 0.05;
		}
		return proximo.desconto(orcamento);
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		this.proximo = proximo;
	}

	private boolean contemItem(List<Item> items, String nome) {
		if (items.stream().filter(i -> i.getNome().equalsIgnoreCase(nome)).findAny().isPresent()) {
			return true;
		}
		return false;
	}

}
