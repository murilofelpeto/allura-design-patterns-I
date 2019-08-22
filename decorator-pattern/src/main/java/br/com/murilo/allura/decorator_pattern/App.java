package br.com.murilo.allura.decorator_pattern;

import br.com.murilo.allura.decorator_pattern.imposto.ICMS;
import br.com.murilo.allura.decorator_pattern.imposto.ISS;
import br.com.murilo.allura.decorator_pattern.imposto.Imposto;
import br.com.murilo.allura.decorator_pattern.imposto.ImpostoMuitoAlto;
import br.com.murilo.allura.decorator_pattern.orcamento.Orcamento;

public class App {
	public static void main(String[] args) {
		 Imposto impostos = new ISS(new ICMS(new ImpostoMuitoAlto()));
         Orcamento orcamento = new Orcamento(500.0);
         
         System.out.println(impostos.calculaImposto(orcamento));
	}
}
