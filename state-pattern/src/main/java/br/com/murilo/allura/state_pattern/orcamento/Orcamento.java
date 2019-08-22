package br.com.murilo.allura.state_pattern.orcamento;

public class Orcamento {
	
	protected Double valor;
	protected EstadoDeUmOrcamento estadoAtual;
	
	public Orcamento(Double valor) {
		this.estadoAtual = new EmAprovacao();
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}

	public void aplicaDesconto() {
		estadoAtual.aplicaDescontoExtra(this);		
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
	
}
