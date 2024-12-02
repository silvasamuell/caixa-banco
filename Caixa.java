package caixa;

public class Caixa {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = this.saldo + saldo;
	}

	public void Sacar(double x) {
		this.saldo = this.saldo - x;
	}

}
