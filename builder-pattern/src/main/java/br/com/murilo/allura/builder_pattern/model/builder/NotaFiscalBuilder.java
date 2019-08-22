package br.com.murilo.allura.builder_pattern.model.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.murilo.allura.builder_pattern.model.Item;
import br.com.murilo.allura.builder_pattern.model.NotaFiscal;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private List<Item> itens = new ArrayList<>();
	private Double valorBruto = 0.0;
	private Double impostos = 0.0;
	private String observacoes;

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
	
	public NotaFiscal build() {
		return new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, itens, observacoes);
	}
}
