

public class Banco {
	private Conta[] contas;
	private Agencia[] agencias;
	private Cliente[] clientes;
	
	Banco(Conta[] contas, Agencia[] agencias, Cliente[] clientes){
		this.contas = contas;
		this.agencias = agencias;
		this.clientes = clientes;
	}
	
	public void criarContaCorrente (int numero, double saldo, boolean chequeS, double limiteCq) {
	ContaCorrente novaConta = new ContaCorrente(numero, saldo, chequeS, limiteCq);
	Conta[] contas = new Conta[this.contas.length + 1];
		for(int i = 0; i < contas.length - 1; i++) {
			contas[i] = this.contas[i];
		}
	contas[contas.length-1] = novaConta;
	this.contas = contas;
	}
	
	public void criarContaPoupanca (int variacao, double rendMen, double saldo, int numero) {
		ContaPoupanca novaConta = new ContaPoupanca(variacao, rendMen, saldo, numero);
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
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		for(int i = 0; i < contas.length; i++) {
			if(contas[i].getNumero() == numeroconta1) {
				conta1 = contas[i];
			}
			if(contas[i].getNumero() == numeroconta2) {
				conta2 = contas[i];
			}
		}
		if(conta1.getSaldo() > valor) {
			conta1.setSaldo(conta1.getSaldo()- valor);
			conta2.setSaldo(conta2.getSaldo() + valor);
		}
	}
}
