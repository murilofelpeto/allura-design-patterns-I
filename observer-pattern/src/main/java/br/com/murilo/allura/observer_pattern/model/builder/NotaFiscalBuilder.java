package br.com.murilo.allura.observer_pattern.model.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.murilo.allura.observer_pattern.model.Item;
import br.com.murilo.allura.observer_pattern.model.NotaFiscal;
import br.com.murilo.allura.observer_pattern.model.acoes.AcoesDeNotaFiscal;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private List<Item> itens = new ArrayList<>();
	private Double valorBruto = 0.0;
	private Double impostos = 0.0;
	private String observacoes;
	private List<AcoesDeNotaFiscal> acoes = new ArrayList<>();

	public NotaFiscalBuilder(List<AcoesDeNotaFiscal> acoes) {
		this.acoes = acoes;
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;		
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder naDataAtual() {
		this.dataEmissao = Calendar.getInstance();
		return this;
	}
	
	public NotaFiscalBuilder comItem(Item item) {
		this.itens.add(item);
		this.valorBruto += item.getValor();
		this.impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder observacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
		
	}
	
	public NotaFiscalBuilder adicionaAcao(AcoesDeNotaFiscal acao) {
		this.acoes.add(acao);
		return this;
	}
	
	public NotaFiscal build() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, itens, observacoes);
		
		for (AcoesDeNotaFiscal acao : acoes) {
			acao.executa(nf);
		}
		
		return nf;
	}
}
