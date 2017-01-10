package CapituloV;

import AtividadeC.Funcionario;

public class Empresa {
	
	public String cnpj,nome;
	public Funcionario[] empregados;
	public int numFunc = 0;
	
	
	public void adiciona(Funcionario add){
		if (numFunc < empregados.length){
			
			this.empregados[numFunc] = add;
			this.numFunc++;
		} else {
			
			realocar();
		}
				
	}
	
	
	private void realocar() {
		Funcionario[] novosEmpregados = new Funcionario[this.empregados.length * 2];
		
		for (int i = 0; i < numFunc; i++){
			
			novosEmpregados[i] = this.empregados[i];
		}
		
		this.empregados = novosEmpregados;
		
	}

	public void mostraEmpregados(){
		
		for (int i = 0; i < this.numFunc; i++){
			
			empregados[i].mostra();
		}
	}
	
	
	
	public boolean contemFuncionario(Funcionario func){
		
		for (int i = 0; i < this.numFunc; i++){
			
			if (empregados[i].rg.equals(func.rg)){
				
				return true;
			}
			
		}
		return false;
	}

}