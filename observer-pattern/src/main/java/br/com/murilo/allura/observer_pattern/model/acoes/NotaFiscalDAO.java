package br.com.murilo.allura.observer_pattern.model.acoes;

import br.com.murilo.allura.observer_pattern.model.NotaFiscal;

public class NotaFiscalDAO implements AcoesDeNotaFiscal {

	@Override
	public void executa(NotaFiscal nota) {
		System.out.println("NF salva no banco");
	}

}
