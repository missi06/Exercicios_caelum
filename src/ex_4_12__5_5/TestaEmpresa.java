package ex_4_12__5_5;

public class TestaEmpresa {

	public static void main(String[]args){
		Empresa em = new Empresa();
		em.empregado = new Funcionario[5];
		
		Funcionario f1 = new Funcionario();
		f1.nome = "João";
		f1.salario = 1000;
		f1.departamento = "Departamento de vendas";
		em.adiciona(f1);
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Carlos";
		f2.salario = 1700;
		f2.departamento = "Departamento de fotos";
		em.adiciona(f2);
		

		Funcionario f3 = new Funcionario();
		f3.nome = "Missi";
		f3.salario = 3000;
		f3.departamento = "Departamento de inormações";
		
		em.contem(f3);
		em.mostraEmpregados();
	}
}
