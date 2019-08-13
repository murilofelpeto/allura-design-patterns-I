package br.com.murilo.allura.template_exercise;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;

import br.com.murilo.allura.template_exercise.model.Banco;
import br.com.murilo.allura.template_exercise.model.Conta;
import br.com.murilo.allura.template_exercise.montagem.MontaRelatorio;
import br.com.murilo.allura.template_exercise.relatorio.Complexo;
import br.com.murilo.allura.template_exercise.relatorio.Relatorio;
import br.com.murilo.allura.template_exercise.relatorio.Simples;

public class App {
	public static void main(String[] args) {
		montarRelatorioSimples();
		System.out.println("############################################################");
		montarRelatorioComplexo();
	}

	private static void montarRelatorioSimples() {
		Relatorio simples = new Simples();
		Banco banco = bancoFactory();
		MontaRelatorio relatorio = new MontaRelatorio();
		relatorio.montar(banco, simples);
		
	}
	
	private static void montarRelatorioComplexo() {
		Relatorio complexo = new Complexo();
		Banco banco = bancoFactory();
		MontaRelatorio relatorio = new MontaRelatorio();
		relatorio.montar(banco, complexo);
		
	}

	private static Banco bancoFactory() {
		Faker faker = new Faker();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String nome = faker.rickAndMorty().location();
		String endereco = faker.address().streetAddress();
		String telefone = faker.phoneNumber().phoneNumber();
		String email = nome + "@gmail.com";
		
		Date hoje = new Date();
		String dataAtual = df.format(hoje);
		
		List<Conta> contas = contasFactory(new Random().nextInt(10));
		Banco banco = new Banco(nome, endereco, telefone, email, dataAtual, contas);
		return banco;
	}

	private static List<Conta> contasFactory(int nextInt) {
		List<Conta> contas = new ArrayList<>();
		Faker faker = new Faker();
		for (int i = 0; i < nextInt; i++) {
			String titular = faker.pokemon().name();
			String agencia = faker.number().digits(5);
			String numeroConta = faker.number().digits(9);
			Double saldo = faker.number().randomDouble(2, 2000, 99999);
			Conta conta = new Conta(titular, agencia, numeroConta, saldo);
			contas.add(conta);						
		}
		return contas;
	}
}
