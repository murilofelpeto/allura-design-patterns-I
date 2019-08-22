package br.com.murilo.allura.observer_pattern;

import java.util.Arrays;
import java.util.List;

import br.com.murilo.allura.observer_pattern.model.Item;
import br.com.murilo.allura.observer_pattern.model.NotaFiscal;
import br.com.murilo.allura.observer_pattern.model.acoes.AcoesDeNotaFiscal;
import br.com.murilo.allura.observer_pattern.model.acoes.EnviadorEmail;
import br.com.murilo.allura.observer_pattern.model.acoes.EnviadorSMS;
import br.com.murilo.allura.observer_pattern.model.acoes.Impressora;
import br.com.murilo.allura.observer_pattern.model.acoes.Multiplicador;
import br.com.murilo.allura.observer_pattern.model.acoes.NotaFiscalDAO;
import br.com.murilo.allura.observer_pattern.model.builder.NotaFiscalBuilder;

public class App {
	public static void main(String[] args) {
		List<AcoesDeNotaFiscal> acoes = Arrays.asList(new EnviadorEmail(),
				new EnviadorSMS(),
				new Impressora(),
				new NotaFiscalDAO(),
				new Multiplicador(5.0));

		NotaFiscal nf = new NotaFiscalBuilder(acoes)
				.paraEmpresa("Murilo S.A")
				.comCnpj("CNPJ")
				.comItem(new Item("Item 1", 200.00))
				.comItem(new Item("Item 2", 300.00))
				.comItem(new Item("Item 3", 400.00))
				.observacoes("OBS").naDataAtual()
				.build();

		System.out.println(nf.toString());
	}
}
