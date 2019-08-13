package br.com.murilo.allura.chain_of_responsability_exercise.resposta;

import br.com.murilo.allura.chain_of_responsability_exercise.contas.Conta;
import br.com.murilo.allura.chain_of_responsability_exercise.formatos.Formato;
import br.com.murilo.allura.chain_of_responsability_exercise.formatos.Requisicao;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RespostaXML implements Resposta {

	private Resposta outraResposta;

	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo()
					+ "</saldo></conta>");
		} else {
			outraResposta.responde(requisicao, conta);
		}

	}
}
