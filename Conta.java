

public class Conta {
	protected double limiteSaq;
	protected double saldo;
	protected int numero;
	private Cliente cliente;
	private Agencia agencia;
	
	public Conta(double saldo, int numero, Cliente cliente, Agencia agencia) {
		this.cliente = cliente;
		this.agencia = agencia;
		limiteSaq = 1200.0;
		this.saldo = saldo;
		this.numero = numero;
		
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
