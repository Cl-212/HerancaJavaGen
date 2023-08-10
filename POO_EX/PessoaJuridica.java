package POO_EX;

public class PessoaJuridica extends Cliente {

	private String cnpj;

	public PessoaJuridica(String nome, String endereco, String contato, String cnpj) {
		super(nome, endereco, contato);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void imprimirClienteCnpj() {
		System.out.println("\n\t\tDADOS DA EMPRESA CLIENTE\n\n" + "Nome: " + getNome() + "\nEndereço Cliente: "
				+ getEndereco() + "\nTelefone: " + getContato() + "\nCNPJ: " + cnpj);

	}

}
