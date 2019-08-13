package br.com.murilo.allura.template_pattern.imposto;

import br.com.murilo.allura.template_pattern.orcamento.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

	private boolean temItemMaiorQueCemReaisNo(Orcamento orcamento) {
		return orcamento.getItems().stream().filter(i -> i.getValor() > 100).findAny().isPresent();
	}

	@Override
	protected Double mininaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected Double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() > 500.00 && temItemMaiorQueCemReaisNo(orcamento));
	}

}
