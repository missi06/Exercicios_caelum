package fixando_conhecimento_Orientacao_objetos;

import javax.swing.JOptionPane;

public class StartCasa {

	public static void main(String[]args){
		Casa c = new Casa();
		
		c.pinta("Amarela");
		
		c.porta1 = Integer.parseInt(JOptionPane.showInputDialog("Porta 1; \nDigite 1 se a porta estiver aberta e 0 se a mesma estiver fechada:"));
		c.porta2 = Integer.parseInt(JOptionPane.showInputDialog("Porta 2; \nDigite 1 se a porta estiver aberta e 0 se a mesma estiver fechada:"));
		c.porta3 = Integer.parseInt(JOptionPane.showInputDialog("Porta 3; \nDigite 1 se a porta estiver aberta e 0 se a mesma estiver fechada:"));
		
		c.quantasPortasEstaoAbertas();
	}
}
