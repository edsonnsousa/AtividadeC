package CapituloVI;

public class TesteEmpresa {

	public static void main(String[] args) {
		
		NewEmpresa empresa = new NewEmpresa("ADS LTDA", 15);
		
		empresa.empregados[0] = new NewFunc("Jose Joao");
		empresa.empregados[0].setSalario(1500.0);
		
		empresa.empregados[1] = new NewFunc("Edson");
		empresa.empregados[1].setSalario(2000.0);
		
		System.out.println("Nome: " + empresa.empregados[0].getNome());
		System.out.println("Salario:  " + empresa.empregados[0].getSalario() + " Reais");
		
		System.out.println("Nome: " + empresa.empregados[1].getNome());
		System.out.println("Salario:  " + empresa.empregados[1].getSalario() + " Reais");

	}

}
