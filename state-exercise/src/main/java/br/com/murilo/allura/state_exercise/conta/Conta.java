package br.com.murilo.allura.state_exercise.conta;

public class Conta {

	protected Double saldo;
	protected Estado estadoAtual;

	public Conta(Double saldo) {
		this.saldo = saldo;
		if (temSaldoPositivo()) {
			estadoAtual = new Positivo();
		} else {
			estadoAtual = new Negativo();
		}
	}

	public void sacar(Double valor) {
		estadoAtual.sacar(this, valor);
	}
	
	public void depositar(Double valor) {
		estadoAtual.depositar(this, valor);
	}
	
	protected boolean temSaldoPositivo() {
		if (this.saldo > 0.0) {
			return true;
		}
		return false;
	}

	public Double getSaldo() {
		return saldo;
	}
}
