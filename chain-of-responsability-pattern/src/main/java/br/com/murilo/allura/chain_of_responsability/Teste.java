package br.com.murilo.allura.chain_of_responsability;

import br.com.murilo.allura.chain_of_responsability.calculadora.CalculadoraDeDesconto;
import br.com.murilo.allura.strategy_pattern.orcamento.Item;
import br.com.murilo.allura.strategy_pattern.orcamento.Orcamento;

public class Teste {

	public static void main(String[] args) {
		CalculadoraDeDesconto descontos = new CalculadoraDeDesconto();
		Orcamento orcamento = new Orcamento(600.00);
		orcamento.adicionaItem(new Item("Lapis", 250.00));
		orcamento.adicionaItem(new Item("CANETA", 250.00));
		
		System.out.println(descontos.calcula(orcamento));

	}

}
