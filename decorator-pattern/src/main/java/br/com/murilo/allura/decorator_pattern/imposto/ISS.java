package br.com.murilo.allura.decorator_pattern.imposto;

import br.com.murilo.allura.decorator_pattern.orcamento.Orcamento;

public class ISS extends Imposto {

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ISS() {}
	
	@Override
	public Double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}
}
