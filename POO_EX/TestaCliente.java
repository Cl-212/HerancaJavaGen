package POO_EX;

public class TestaCliente {
	
	public static void main(String[]args) {
		PessoaFisica pessoa = new PessoaFisica("Clésio", "Rua da Marola, 420", "4002-8922","07895667547");
		
		PessoaJuridica empresa = new PessoaJuridica("GamesXTutãoX", "av.Paulista, 53", "", "554362082045");
		
		pessoa.imprimirClienteCpf();
		
		empresa.imprimirClienteCnpj();
	}

}
