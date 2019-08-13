package br.com.murilo.allura.chain_of_responsability_exercise.imprime_ados;

import br.com.murilo.allura.chain_of_responsability_exercise.contas.Conta;
import br.com.murilo.allura.chain_of_responsability_exercise.formatos.Requisicao;
import br.com.murilo.allura.chain_of_responsability_exercise.resposta.Resposta;
import br.com.murilo.allura.chain_of_responsability_exercise.resposta.RespostaCSV;
import br.com.murilo.allura.chain_of_responsability_exercise.resposta.RespostaPorcentagem;
import br.com.murilo.allura.chain_of_responsability_exercise.resposta.RespostaXML;

public class Imprimir {

	public void imprimir(Requisicao requisicao, Conta conta) {
		Resposta porcentagem = new RespostaPorcentagem();
		Resposta csv = new RespostaCSV(porcentagem);
		Resposta xml = new RespostaXML(csv);
		
		xml.responde(requisicao, conta);
	}
}
