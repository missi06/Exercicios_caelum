package ex_6_8;

public class Testar_funcionario {

	public static void main(String args[]) {
		Funcionario f = new Funcionario();
		
		f.setSalario(1000);
		f.setNome("Missi");
		
		System.out.println("Nome: " + f.getNome() + "\nSalário: R$ " + f.getSalario() + "\nGanho anual: R$ " + f.getGanhoAnual());
		
		
	}
}
