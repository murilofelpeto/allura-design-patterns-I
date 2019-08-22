package br.com.murilo.allura.state_exercise.conta;

public class Positivo implements Estado{

	@Override
	public void sacar(Conta conta, Double valor) {
		conta.saldo -= valor;
		if (!conta.temSaldoPositivo()) {
			conta.estadoAtual = new Negativo();
		}
	}

	@Override
	public void depositar(Conta conta, Double valor) {
		conta.saldo += valor * 0.98;
	}

}
