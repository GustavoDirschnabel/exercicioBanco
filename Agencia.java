

public class Agencia {
	private String nome;
	private String endereco;
	private int numero;
	private Cliente[] listaClientes;
	private Conta[] listaContas;
	
	public Agencia(String nome, String endereco, int numero, Cliente[] listaClientes, Conta[] listaContas) {
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
		this.listaClientes = listaClientes;
		this.listaContas = listaContas;
	}
	
}