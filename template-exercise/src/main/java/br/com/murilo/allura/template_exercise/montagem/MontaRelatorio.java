package br.com.murilo.allura.template_exercise.montagem;

import br.com.murilo.allura.template_exercise.model.Banco;
import br.com.murilo.allura.template_exercise.relatorio.Relatorio;

public class MontaRelatorio {

	public void montar(Banco banco, Relatorio relatorio) {
		relatorio.montar(banco);
	}
}
