package POO_EX;

public class PessoaFisica extends Cliente {

	private String cpf;

	public PessoaFisica(String nome, String endereco, String contato, String cpf) {
		super(nome, endereco, contato);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void imprimirClienteCpf() {
		System.out.println("\n\t\tDADOS DO CLIENTE\n\n" + "Nome: " + getNome() + "\nEndereço Cliente: " + getEndereco()
				+ "\nTelefone: " + getContato() + "\nCPF: " + cpf);

	}
}