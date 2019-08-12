package br.com.murilo.allura.chain_of_responsability.calculadora;

import br.com.murilo.allura.chain_of_responsability.desconto.Desconto;
import br.com.murilo.allura.chain_of_responsability.desconto.DescontoPorCincoItems;
import br.com.murilo.allura.chain_of_responsability.desconto.DescontoPorMaisDeQuinhetosReais;
import br.com.murilo.allura.chain_of_responsability.desconto.DescontoPorVendaCasada;
import br.com.murilo.allura.chain_of_responsability.desconto.SemDesconto;
import br.com.murilo.allura.strategy_pattern.orcamento.Orcamento;

public class CalculadoraDeDesconto {

	public Double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItems();
		Desconto d2 = new DescontoPorVendaCasada();
		Desconto d3 = new DescontoPorMaisDeQuinhetosReais();
		Desconto d4 = new SemDesconto();
		
		d1.setProximoDesconto(d2);
		d2.setProximoDesconto(d3);
		d3.setProximoDesconto(d4);
		
		return d1.desconto(orcamento);
	}
}
