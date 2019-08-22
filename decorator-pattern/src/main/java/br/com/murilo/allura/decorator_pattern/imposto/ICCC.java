package br.com.murilo.allura.decorator_pattern.imposto;

import br.com.murilo.allura.decorator_pattern.orcamento.Orcamento;

public class ICCC extends Imposto {

	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}

	public ICCC() {}
	
	@Override
	public Double calculaImposto(Orcamento orcamento) {
		Double valor = orcamento.getValor();

		if (orcamento.getValor() < 1000.00) {
			return valor * 0.05 + calculoDoOutroImposto(orcamento);
		} else if (valor >= 1000.00 && valor <= 3000.00) {
			return valor * 0.07 + calculoDoOutroImposto(orcamento);
		} else {
			return (valor * 0.08) + 30.00 + calculoDoOutroImposto(orcamento);
		}
	}

}
