package br.com.murilo.allura.strategy_pattern.imposto;

import br.com.murilo.allura.strategy_pattern.orcamento.Orcamento;

public interface Imposto {

	public Double calculaImposto(Orcamento orcamento);
}
