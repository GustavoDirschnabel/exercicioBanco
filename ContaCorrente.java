

public class ContaCorrente extends Conta {
	private int numero;
	private boolean chequeS;
	private double limiteCheque;
	private Movimentacao [] movimentacoes;
	
	public ContaCorrente(int numero, double saldo, boolean chequeS, Movimentacao[] moviment, double limiteCq){
	super(saldo, numero);
	this.chequeS = chequeS;
	this.movimentacoes = moviment;
	if(chequeS) {
		this.limiteCheque = limiteCq;
	}else {
		limiteCheque = 0;
	}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isChequeS() {
		return chequeS;
	}

	public void setChequeS(boolean chequeS) {
		this.chequeS = chequeS;
	}

	public Movimentacao[] getMovimentacoes() {
		return movimentacoes;
	}

	public void setMovimentacoes(Movimentacao[] movimentacoes) {
		this.movimentacoes = movimentacoes;
	}

	public double getLimiteCheque() {
		return limiteCheque;
	}

	public void setLimiteCheque(double limiteCheque) {
		this.limiteCheque = limiteCheque;
	}
	
}
