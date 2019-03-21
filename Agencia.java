
public class Agencia {
	private String nome;
	private String endereco;
	private int numero;
	private Cliente[] listaClientes;
	private Conta[] listaContas;
	
	public Agencia(String nome, String endereco, int numero, Clinte[] listaClientes, Conta[] listaContas) {
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
		this.listaClintes = listaClientes;
		this.listaContas = listaContas;
	}
	
}