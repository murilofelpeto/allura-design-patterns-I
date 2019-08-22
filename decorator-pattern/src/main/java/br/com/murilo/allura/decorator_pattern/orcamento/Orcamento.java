package br.com.murilo.allura.decorator_pattern.orcamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	private Double valor;
	private List<Item> items;
	
	public Orcamento(Double valor) {
		this.valor = valor;
		items = new ArrayList<>();
	}

	public Double getValor() {
		return valor;
	}

	public void adicionaItem(Item item) {
		items.add(item);
	}
	
	public List<Item> getItems(){
		return Collections.unmodifiableList(items);
	}
}
