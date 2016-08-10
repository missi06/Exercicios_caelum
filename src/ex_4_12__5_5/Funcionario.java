package ex_4_12__5_5;

public class Funcionario {

	String nome;
	String departamento;
	Data dataEntrada;
	String rg;
	double salario;
	
	/*void recebeAumento(double aumento){
		this.salario += aumento;
	}
	*/
	double calculaGanhoAnual(){
		double ganhoAnual = this.salario * 12;
		//System.out.print("Ganho anual: R$" + ganhoAnual);
		return ganhoAnual;
		}
	
	
	void mostra(){
		System.out.print("Nome do funcionário: " + this.nome);
		System.out.print("\nSalario Atual: R$ " + this.salario);
		System.out.print("\nGanho Anual: R$ " + this.calculaGanhoAnual());
		
		System.out.println("\nData: " + this.dataEntrada.formatada());
	}
}
