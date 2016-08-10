package ex_4_12__5_5;

public class Empresa {
	
	String nome;
	String cnpj;
	Funcionario[] empregado;
	int total = 0;
	
	
	//////////
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	///////////////
	public Funcionario getFuncionario (int posicao) {
		return this.empregado[posicao];
		}
	
	/////////////
	void adiciona(Funcionario f) {
		if (total > 5){  
            System.out.println("Cheio");  
        }  
        else{  
        this.empregado[total] = f;      
        this.total++;    
        } 
		}
	
	void mostraEmpregados() {
		System.out.println("\n\n-- Funcionarios cadastrados --\n");      
        for (int i = 0; i < this.empregado.length; i++) {  
            if (empregado[i] != null){  
            System.out.println("Funcionário na posição: " + i);  
            System.out.println("Nome: " + empregado[i].nome + "\nSalário: R$ " + empregado[i].salario + "\nDepartamento: " + empregado[i].departamento + "\n");      
            }  
            else{  
                break;  
            }  
        }  
		}
	 boolean contem(Funcionario f){ 
         for (int i = 0; i < this.empregado.length; i++) { 
         if (f == empregado[i]){ 
         System.out.println("Funcionario já trabalha nesta empresa"); 
         return true; 
         } 
         } 
         System.out.println("O Funcionário não trabalha conosco"); 
         return false; 
         }
	
}
