package br.com.murilo.allura.state_pattern.orcamento;

public interface EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);
	void aprova(Orcamento orcamento);
	void reprova(Orcamento orcamento);
	void finaliza(Orcamento orcamento);
}
