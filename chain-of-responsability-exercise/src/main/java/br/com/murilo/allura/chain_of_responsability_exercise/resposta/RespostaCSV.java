package br.com.murilo.allura.chain_of_responsability_exercise.resposta;

import br.com.murilo.allura.chain_of_responsability_exercise.contas.Conta;
import br.com.murilo.allura.chain_of_responsability_exercise.formatos.Formato;
import br.com.murilo.allura.chain_of_responsability_exercise.formatos.Requisicao;

public class RespostaCSV implements Resposta {

	private Resposta outraResposta;

	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		} else {
			outraResposta.responde(requisicao, conta);
		}
	}

	@Override
	public void setProxima(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

}
