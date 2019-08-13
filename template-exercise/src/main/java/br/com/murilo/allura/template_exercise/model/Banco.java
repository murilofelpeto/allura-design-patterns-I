package br.com.murilo.allura.template_exercise.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Banco {

	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private String dataAtual;
	private List<Conta> contas;
}
