package br.com.murilo.allura.decorator_pattern.imposto;

import br.com.murilo.allura.decorator_pattern.orcamento.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto() {}
	
	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public Double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
	}

}
