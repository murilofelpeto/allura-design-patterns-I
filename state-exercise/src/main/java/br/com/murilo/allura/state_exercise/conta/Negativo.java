package br.com.murilo.allura.state_exercise.conta;

public class Negativo implements Estado {

	@Override
	public void sacar(Conta conta, Double valor) {
		throw new RuntimeException("Seu saldo é negativo e não pode realizar saques");
	}

	@Override
	public void depositar(Conta conta, Double valor) {
		conta.saldo += valor * 0.95 ;
	}

}
