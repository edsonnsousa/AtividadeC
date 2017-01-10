package CapituloVI;

public class NewEmpresa {
	
	private String nome;
	public NewFunc[] empregados;
	
	//Question 7
	public NewEmpresa(String nome, int numFunc) {
		
		setNome(nome);
		this.empregados = new NewFunc[numFunc];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
