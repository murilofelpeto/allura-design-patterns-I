package br.com.murilo.allura.template_exercise.relatorio;

import br.com.murilo.allura.template_exercise.model.Banco;

public abstract class TemplateRelatorio implements Relatorio {

	@Override
	public void montar(Banco banco) {
		montarCabecalho(banco);
		montarCorpo(banco);
		montarRodape(banco);
	}
	
	public abstract void montarCabecalho(Banco banco);
	public abstract void montarRodape(Banco banco);
	public abstract void montarCorpo(Banco banco);

}
