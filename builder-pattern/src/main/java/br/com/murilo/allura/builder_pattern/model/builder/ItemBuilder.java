package br.com.murilo.allura.builder_pattern.model.builder;

import br.com.murilo.allura.builder_pattern.model.Item;

public class ItemBuilder {

	private String nome;
	private Double valor = 0.0;

	public ItemBuilder comNome(String nome) {
		this.nome = nome;
		return this;		
	}
	
	public ItemBuilder comValor(Double valor) {
		this.valor = valor;
		return this;		
	}
	
	public Item build() {
		return new Item(nome, valor);
	}
}
