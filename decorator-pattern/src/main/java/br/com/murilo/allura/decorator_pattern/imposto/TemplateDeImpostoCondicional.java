package br.com.murilo.allura.decorator_pattern.imposto;

import br.com.murilo.allura.decorator_pattern.orcamento.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {

	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public TemplateDeImpostoCondicional() {}

	@Override
	public Double calculaImposto(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}
		return mininaTaxacao(orcamento);
	}
	

	protected abstract Double mininaTaxacao(Orcamento orcamento);

	protected abstract Double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
