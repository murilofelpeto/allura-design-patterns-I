package br.com.murilo.allura.chain_of_responsability_exercise;

import br.com.murilo.allura.chain_of_responsability_exercise.contas.Conta;
import br.com.murilo.allura.chain_of_responsability_exercise.formatos.Formato;
import br.com.murilo.allura.chain_of_responsability_exercise.formatos.Requisicao;
import br.com.murilo.allura.chain_of_responsability_exercise.imprime_ados.Imprimir;

public class App {
	public static void main(String[] args) {
		Conta conta = new Conta("Murilo", 6000.00);
		Requisicao requisicao = new Requisicao(Formato.XML);
		Imprimir imprimir = new Imprimir();
		
		imprimir.imprimir(requisicao, conta);
		
	}
}
