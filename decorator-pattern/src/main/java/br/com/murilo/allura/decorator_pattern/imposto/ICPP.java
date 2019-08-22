package br.com.murilo.allura.decorator_pattern.imposto;

import br.com.murilo.allura.decorator_pattern.orcamento.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICPP() {}
	
	@Override
	protected Double mininaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected Double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500.00;
	}

}
