package br.com.murilo.allura.decorator_pattern.imposto;

import br.com.murilo.allura.decorator_pattern.orcamento.Orcamento;

public class ICMS extends Imposto{

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ICMS() {}
	
	@Override
	public Double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50 + calculoDoOutroImposto(orcamento);
	}
}
