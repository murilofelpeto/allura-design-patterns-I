package br.com.murilo.allura.chain_of_responsability_exercise.resposta;

import br.com.murilo.allura.chain_of_responsability_exercise.contas.Conta;
import br.com.murilo.allura.chain_of_responsability_exercise.formatos.Formato;
import br.com.murilo.allura.chain_of_responsability_exercise.formatos.Requisicao;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RespostaPorcentagem implements Resposta {

	private Resposta outraResposta;

	public RespostaPorcentagem() {
        this.outraResposta = null;
    }
	
	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else if (outraResposta != null){
			outraResposta.responde(requisicao, conta);
		}else {
			throw new RuntimeException("Formato de resposta não encontrado");
		}

	}
}
