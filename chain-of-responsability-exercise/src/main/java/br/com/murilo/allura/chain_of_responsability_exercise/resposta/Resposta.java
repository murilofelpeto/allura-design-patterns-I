package br.com.murilo.allura.chain_of_responsability_exercise.resposta;

import br.com.murilo.allura.chain_of_responsability_exercise.contas.Conta;
import br.com.murilo.allura.chain_of_responsability_exercise.formatos.Requisicao;

public interface Resposta {

	void responde(Requisicao requisicao, Conta conta);
	void setProxima(Resposta outraResposta);
}
