

public class Banco {
	private Conta[] contas;
	private Agencia[] agencias;
	private Cliente[] clientes;
	
	public Banco(){
		this.contas = new Conta[0];
		this.agencias = new Agencia[0];
		this.clientes = new Cliente[0];
	}
	
	public void criarContaCorrente (int numero, double saldo, boolean chequeS, double limiteCq, Cliente cliente, Agencia agencia) {
	ContaCorrente novaConta = new ContaCorrente(numero, saldo, chequeS, limiteCq,cliente,agencia);
	Conta[] contas = new Conta[this.contas.length + 1];
		for(int i = 0; i < contas.length - 1; i++) {
			contas[i] = this.contas[i];
		}
	contas[contas.length-1] = novaConta;
	this.contas = contas;
	}
	
	public void criarContaPoupanca (int variacao, double rendMen, double saldo, int numero, Cliente cliente, Agencia agencia) {
		ContaPoupanca novaConta = new ContaPoupanca(variacao, rendMen, saldo, numero,cliente, agencia);
		Conta[] contas = new Conta[this.contas.length + 1];
			for(int i = 0; i < contas.length - 1; i++) {
				contas[i] = this.contas[i];
			}
		contas[contas.length-1] = novaConta;
		this.contas = contas;
	}
	
	public void excluirConta (int numeroConta) {
		Conta[] contas = new Conta[this.contas.length -1];
			for(int i = 0; i < contas.length; i++) {
				if(this.contas[i].getNumero() != numeroConta) {
					contas[i] = this.contas[i];
				}
			}
		this.contas = contas;
	}
	
	public void saque(double valor, int numeroConta) {
		for (int i = 0; i < this.contas.length; i++) {
			if(contas[i].getNumero() == numeroConta) {
				if(contas[i].getSaldo() > valor) {
					if(contas[i] instanceof ContaPoupanca) {
						if(contas[i].getLimiteSaq() > valor) {
							contas[i].setSaldo(contas[i].getSaldo()-valor);
						}
					}
					else {
						if(contas[i].getLimiteSaq() + ((ContaCorrente) contas[i]).getLimiteCheque() > valor) {
							contas[i].setSaldo(contas[i].getSaldo()-valor);
						}
					}	
				}
			return;
			}
		}
	}
	
	public void deposito( double valor, int numeroConta) {
		for(int i = 0; i < this.contas.length; i++) {
			if (contas[i].getNumero() == numeroConta) {
				contas[i].setSaldo(contas[i].getSaldo() + valor);
				return;
			}
		}
	}
	
	public double emissaoSaldo(int numero) {
		for( int i = 0; i < this.contas.length; i ++) {
			if(contas[i].getNumero() == numero) {
				return contas[i].getSaldo();
			}
		}
		return 0.0;
	}
	
	public Movimentacao[] extrato(int numeroConta) {
		ContaCorrente conta;
		for ( int i = 0; i < contas.length; i++) {
			if(contas[i].getNumero() == numeroConta && contas[i] instanceof ContaCorrente) {
				conta = (ContaCorrente) contas[i];
				return conta.getMovimentacoes();
			}
		}
		return null;
	}
	
	public void transferencia( int numeroconta1, int numeroconta2, int valor) {
		int index1 = 0, index2 = 0;
		for(int i = 0; i < contas.length; i++) {
			if(contas[i].getNumero() == numeroconta1) {
				index1 = i;
			}
			if(contas[i].getNumero() == numeroconta2) {
				index2 = i;
			}
		}
		if(contas[index1].getSaldo() >= valor) {
			contas[index1].setSaldo(contas[index1].getSaldo()- valor);
			contas[index2].setSaldo(contas[index2].getSaldo() + valor);
		}
	}
}
