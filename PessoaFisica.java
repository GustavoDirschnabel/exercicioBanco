public class PessoaFisica extends Cliente{
	private int CPF;
	private String estadoCivil;
	
	public PessoaFisica(int CPF, String Estcvl,String nome, String endereco, int telefone, String email, Conta[] listaContas) {
		super(nome, endereco, telefone, email, listaContas);
		this.CPF = CPF;
		this.estadoCivil = Estcvl;
	}
}