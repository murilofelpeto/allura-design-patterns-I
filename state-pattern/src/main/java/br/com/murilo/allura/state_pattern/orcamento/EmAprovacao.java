package br.com.murilo.allura.state_pattern.orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento {

	private Boolean descontoRealizado = false;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoRealizado) {
			orcamento.valor -= orcamento.valor * 0.05;
			descontoRealizado = true;			
		}else {
			throw new RuntimeException("Desconto só pode ser aplicado uma unica vez");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamento em aprovação não pode ser finalizado");
	}

}
