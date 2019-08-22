package br.com.murilo.allura.decorator_pattern.imposto;

import br.com.murilo.allura.decorator_pattern.orcamento.Orcamento;

public abstract class Imposto {

	protected final Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public Imposto() {
		this.outroImposto = null;
	}

	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if (outroImposto == null) {
			return 0;
		}
		return outroImposto.calculaImposto(orcamento);
	}

	public abstract Double calculaImposto(Orcamento orcamento);

}
