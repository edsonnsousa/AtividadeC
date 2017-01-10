package CapituloV;
import AtividadeC.Funcionario;


public class TestaEmpresa {
	
	public static void main(String[] args) {
		

		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[1];
		
		Funcionario func1 = new Funcionario(), func2 = new Funcionario();
		func1.nome = "Pedro";
		func2.nome = "Pedro";
		
		func2.salario = 780.00;
		func2.rg = "1234";
		func2.funcao="Motorista";
				
		func1.salario = 780.00;
		func1.rg = "1234";
		func2.funcao="Gerente";
		
		empresa.nome = "ADS Company";
		empresa.adiciona(func1);
		
		
		empresa.mostraEmpregados();
		
		empresa.adiciona(func2);
		
		empresa.mostraEmpregados();
		
		
		if (empresa.contemFuncionario(func2)){
			
			System.out.println("Eh Funcionario");
		} else {
			
			System.out.println("Nao Eh Funcionario");
		} 
		
	}

}