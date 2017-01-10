package CapituloVI;
import AtividadeC.Data;
public class NewFunc {
	
	private String nome;
	public NewFunc[] empregados;
	
	//Question 7
	public NewFunc(String nome, int numFunc) {
		
		setNome(nome);
		this.empregados = new NewFunc[numFunc];
	}

	public NewFunc(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double d) {
		// TODO Auto-generated method stub
		
	}

	public String getSalario() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
