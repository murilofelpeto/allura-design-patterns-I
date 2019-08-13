package br.com.murilo.allura.template_pattern.imposto;

import java.util.ArrayList;
import java.util.List;

import br.com.murilo.allura.template_pattern.orcamento.Item;
import br.com.murilo.allura.template_pattern.orcamento.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	protected Double mininaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (orcamento.getItems().size() * 0.01);
	}

	@Override
	protected Double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100.00; 
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return findDuplicatedItem(orcamento);
	}

	private boolean findDuplicatedItem(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();

        for(Item item : orcamento.getItems()) {
          if(noOrcamento.contains(item.getNome())) return true;
          else noOrcamento.add(item.getNome());
        }

        return false;
	}

}
