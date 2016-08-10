package ex_4_12__5_5;

public class Go {

	public static void main(String[]args){
		Funcionario f1 = new Funcionario();
		
			Data data = new Data();
		f1.nome = "Missi";
		f1.salario = 1500;
		f1.dataEntrada = data;
		data.dia = 15;
		data.mes = 07;
		data.ano = 2016;
		f1.mostra();
		
				
		//f1.recebeAumento(50);	
		
		/*Funcionario f2 = f1;
		f2.nome = "Missi";
		f2.salario = 1500;
					
		if (f1 == f2){
			System.out.println("São iguais");
		}else{
			System.out.print("Não são iguais");
		}*/
	}
}
