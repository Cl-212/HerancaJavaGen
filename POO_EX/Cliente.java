package POO_EX;

public class Cliente {

	private String nome;
	private String endereco;
	private String contato;

	public Cliente(String nome, String endereco, String contato) {
		this.nome = nome;
		this.endereco = endereco;
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public void imprimirCliente() {
		System.out.println("Nome: " + nome + "\nEndereço" + endereco + "\nTelefona ou celular: " + contato);
	}

}
