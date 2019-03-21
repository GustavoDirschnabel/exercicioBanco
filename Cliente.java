public class Cliente{
	private String nome;
	private String endereco;
	private int telefone;
	private String email;
	private Conta[] listaContas;
	
	public Cliente(String nome, String endereco, int telefone, String email, Conta[] listaContas) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.listaContas = listaContas;
	}
}