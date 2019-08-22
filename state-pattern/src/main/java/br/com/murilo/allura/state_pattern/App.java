package br.com.murilo.allura.state_pattern;

import br.com.murilo.allura.state_pattern.orcamento.Orcamento;

public class App {
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(1000.00);

		reforma.aplicaDesconto();
		System.out.println("Valor em aprovação: R$" + reforma.getValor());

		reforma.aprova();
		reforma.aplicaDesconto();
		System.out.println("Valor orçamento aprovado: R$" + reforma.getValor());

		reforma.finaliza();
//		reforma.aplicaDesconto();
//		reforma.aprova();

	}
}
