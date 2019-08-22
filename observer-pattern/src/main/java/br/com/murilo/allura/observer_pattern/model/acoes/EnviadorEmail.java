package br.com.murilo.allura.observer_pattern.model.acoes;

import br.com.murilo.allura.observer_pattern.model.NotaFiscal;

public class EnviadorEmail implements AcoesDeNotaFiscal {

	@Override
	public void executa(NotaFiscal nota) {
		System.out.println("Email enviado");
	}

}
