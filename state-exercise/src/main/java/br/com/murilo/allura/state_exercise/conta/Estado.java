package br.com.murilo.allura.state_exercise.conta;

public interface Estado {

	void sacar(Conta conta, Double valor);
	void depositar(Conta conta, Double valor);
}
