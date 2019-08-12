package br.com.murilo.allura.chain_of_responsability_exercise.imprime_ados;

import br.com.murilo.allura.chain_of_responsability_exercise.contas.Conta;
import br.com.murilo.allura.chain_of_responsability_exercise.formatos.Requisicao;
import br.com.murilo.allura.chain_of_responsability_exercise.resposta.Resposta;
import br.com.murilo.allura.chain_of_responsability_exercise.resposta.RespostaCSV;
import br.com.murilo.allura.chain_of_responsability_exercise.resposta.RespostaPorcentagem;
import br.com.murilo.allura.chain_of_responsability_exercise.resposta.RespostaXML;

public class Imprimir {

	public void imprimir(Requisicao requisicao, Conta conta) {
		Resposta csv = new RespostaCSV();
		Resposta xml = new RespostaXML();
		Resposta porcentagem = new RespostaPorcentagem();
		
		csv.setProxima(xml);
		xml.setProxima(porcentagem);
		
		csv.responde(requisicao, conta);
	}
}
