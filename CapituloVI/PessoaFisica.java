package CapituloVI;

public class PessoaFisica {
	
	private String nome;
	private String cpf;

	public PessoaFisica(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public boolean validaCpf(String cpf){
		
		if (getCpf().equals(cpf)){
			
			return true;
		}
		return false;
	}

	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}
	
	
}