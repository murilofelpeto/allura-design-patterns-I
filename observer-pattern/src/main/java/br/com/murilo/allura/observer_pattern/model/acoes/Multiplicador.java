package br.com.murilo.allura.observer_pattern.model.acoes;

import br.com.murilo.allura.observer_pattern.model.NotaFiscal;

public class Multiplicador implements AcoesDeNotaFiscal {

	private Double valor;

	public Multiplicador(Double valor) {
		this.valor = valor;
	}

	@Override
	public void executa(NotaFiscal nota) {
		System.out.println(nota.getValorBruto() * this.valor);
	}
}
