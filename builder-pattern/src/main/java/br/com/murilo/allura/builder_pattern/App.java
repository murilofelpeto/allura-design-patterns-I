package br.com.murilo.allura.builder_pattern;

import br.com.murilo.allura.builder_pattern.model.NotaFiscal;
import br.com.murilo.allura.builder_pattern.model.builder.ItemBuilder;
import br.com.murilo.allura.builder_pattern.model.builder.NotaFiscalBuilder;

public class App {
	public static void main(String[] args) {
		ItemBuilder itemBuilder = new ItemBuilder();
		NotaFiscal nf = new NotaFiscalBuilder()
				.paraEmpresa("Murilo S.A")
				.comCnpj("CNPJ")
				.comItem(itemBuilder.comNome("Item 1").comValor(200.00).build())
				.comItem(itemBuilder.comNome("Item 2").comValor(300.00).build())
				.comItem(itemBuilder.comNome("Item 3").comValor(400.00).build())
				.observacoes("OBS")
				.naDataAtual()
				.build();
		
		System.out.println(nf.toString());	
	}
}
