package br.com.murilo.allura.state_exercise;

import br.com.murilo.allura.state_exercise.conta.Conta;

public class App {
	public static void main(String[] args) {
		Conta conta = new Conta(500.00);
		
		conta.depositar(100.00);
		System.out.println("Saldo: R$" + conta.getSaldo());
		
		conta.sacar(50.00);
		System.out.println("Saldo: R$" + conta.getSaldo());
		
		System.out.println("NEGATIVANDO A CONTA");
		
		conta.sacar(700.00);
		System.out.println("Saldo: R$" + conta.getSaldo());
		
		conta.depositar(162.00);
		System.out.println("Saldo: R$" + conta.getSaldo());
	}
}
