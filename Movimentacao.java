package aula1;

public class Movimentacao {
	private String descricao;
	private double valor;
	private char DouS;
	
	public Movimentacao(String descri, double valor, char DouS) {
		this.descricao = descri;
		this.DouS = DouS;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public char getDouS() {
		return DouS;
	}

	public void setDouS(char douS) {
		DouS = douS;
	}
	
}
