package br.com.murilo.allura.template_exercise.relatorio;

import br.com.murilo.allura.template_exercise.model.Banco;
import br.com.murilo.allura.template_exercise.model.Conta;

public class Simples extends TemplateRelatorio {

	@Override
	public void montarCabecalho(Banco banco) {
		System.out.println("CABEÇALHO");
		System.out.println("Banco: " + banco.getNome() + "\t Telefone: " + banco.getTelefone());
		
	}

	@Override
	public void montarRodape(Banco banco) {
		System.out.println("RODAPÉ");
		System.out.println("Banco: " + banco.getNome() + "\t Telefone: " + banco.getTelefone());
		
	}

	@Override
	public void montarCorpo(Banco banco) {
		System.out.println("CORPO");
		System.out.println("---------------------------------------");
		for (Conta conta : banco.getContas()) {
			System.out.println("Titular conta: " + conta.getTitular());
			System.out.println("Saldo: " + conta.getSaldo());
			System.out.println("---------------------------------------");
		}		
	}

}
