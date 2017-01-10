package CapituloVI;
public class TestePessoa {

	public static void main(String[] args) {
		
		PessoaFisica pessoa = new PessoaFisica("Joao Jose", "12345");
		
		if (pessoa.validaCpf("54321")){
			
			System.out.println("-->CPF Valido<--");
		} else{
			
			System.out.println("-->CPF Invalido<--");
		} 

	}

}
