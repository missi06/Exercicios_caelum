package fixando_conhecimento_Orientacao_objetos;

import javax.swing.JOptionPane;

public class StartPessoa {

	public static void main(String[]args){
		Pessoa p1 = new Pessoa();
		
		p1.nome = JOptionPane.showInputDialog("Digite o nome do funcionario");
		p1.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionario"));
		p1.fazAniversario(7);
		
		System.out.println("Nome: " + p1.nome + "\nIdade: " + p1.idade + " anos");
	}
}
