

public class ContaPoupanca extends Conta {
	private int variacao;
	private double rendMen;
	
	
	public ContaPoupanca(int variacao, double rendMen, double saldo, int numero, Cliente cliente, Agencia agencia) {
		super(saldo, numero, cliente, agencia);
		this.variacao = variacao;
		this.rendMen = rendMen;
	}


	public int getVariacao() {
		return variacao;
	}


	public void setVariacao(int variacao) {
		this.variacao = variacao;
	}


	public double getRendMen() {
		return rendMen;
	}


	public void setRendMen(double rendMen) {
		this.rendMen = rendMen;
	}
	
}
