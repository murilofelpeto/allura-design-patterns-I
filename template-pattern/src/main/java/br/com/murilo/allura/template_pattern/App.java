package br.com.murilo.allura.template_pattern;


import br.com.murilo.allura.template_pattern.calculadora.CalculadoraImposto;
import br.com.murilo.allura.template_pattern.imposto.ICPP;
import br.com.murilo.allura.template_pattern.imposto.IHIT;
import br.com.murilo.allura.template_pattern.imposto.IKCV;
import br.com.murilo.allura.template_pattern.orcamento.Item;
import br.com.murilo.allura.template_pattern.orcamento.Orcamento;


public class App 
{
	public static void main(String[] args) {
		CalculadoraImposto imposto = new CalculadoraImposto();
		Orcamento orcamento = new Orcamento(100.00);
		orcamento.adicionaItem(new Item("Lapis", 20.00));
		orcamento.adicionaItem(new Item("Caneta", 10.00));
		
		imposto.realizaCalculo(orcamento, new ICPP());
		imposto.realizaCalculo(orcamento, new IKCV());
		imposto.realizaCalculo(orcamento, new IHIT());

	}
}
