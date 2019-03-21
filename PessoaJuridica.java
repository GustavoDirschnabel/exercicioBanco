public class PessoaJuridica {
	private int CNPJ;
	
	public PessoaJuridica(int CNPJ, String nome, String endereco, int telefone, String email, Conta[] listaContas) {
		super(nome, endereco,telefone,email,listaContas);
		this.CNPJ = CNPJ;
	}
}
