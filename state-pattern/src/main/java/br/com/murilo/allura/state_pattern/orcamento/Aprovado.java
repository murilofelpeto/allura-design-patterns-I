package br.com.murilo.allura.state_pattern.orcamento;

public class Aprovado implements EstadoDeUmOrcamento {

	private Boolean descontoRealizado = false;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoRealizado) {
			orcamento.valor -= orcamento.valor * 0.02;
			descontoRealizado = true;			
		}else {
			throw new RuntimeException("Desconto só pode ser aplicado uma unica vez");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já aprovado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento aprovado não pode ser reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
