public class PessoaJuridica {
	private int CPNJ;
	
	public PessoaJuridica(int CPNJ, String nome, String endereco, int telefone, String email, Conta[] listaContas) {
		super(nome, endereco,telefone,email,listaContas);
		this.CPNJ = CPNJ;
	}
}