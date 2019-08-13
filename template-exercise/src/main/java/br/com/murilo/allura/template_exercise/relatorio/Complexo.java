package br.com.murilo.allura.template_exercise.relatorio;

import br.com.murilo.allura.template_exercise.model.Banco;
import br.com.murilo.allura.template_exercise.model.Conta;

public class Complexo extends TemplateRelatorio {

	@Override
	public void montarCabecalho(Banco banco) {
		System.out.println("CABEÇALHO");
		System.out.println("Banco: " + banco.getNome());
		System.out.println("Endereço: " + banco.getTelefone());
		System.out.println("Telefone: " + banco.getTelefone());
	}

	@Override
	public void montarRodape(Banco banco) {
		System.out.println("RODAPÉ");
		System.out.println("Email: " + banco.getEmail());
		System.out.println("Data: " + banco.getDataAtual());
	}

	@Override
	public void montarCorpo(Banco banco) {
		System.out.println("CORPO");
		System.out.println("---------------------------------------");
		for (Conta conta : banco.getContas()) {
			System.out.println("Titular: " + conta.getTitular());
			System.out.println("Agencia: " + conta.getAgencia());
			System.out.println("Conta: " + conta.getNumeroConta());
			System.out.println("Saldo: " + conta.getSaldo());
			System.out.println("---------------------------------------");
		}
	}
}
