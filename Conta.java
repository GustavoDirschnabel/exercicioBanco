

public class Conta {
	protected double limiteSaq;
	protected double saldo;
	protected int numero;
	public Conta(double saldo, int numero) {
		limiteSaq = 1200.0;
		this.saldo = saldo;
		this.numero = numero;
	}
	public Conta() {
		limiteSaq = 1200.0;
		this.saldo = 0.0;
		this.numero = 0;
	}

	public double getLimiteSaq() {
		return limiteSaq;
	}

	public void setLimiteSaq(double limiteSaq) {
		this.limiteSaq = limiteSaq;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
