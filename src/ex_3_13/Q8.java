package ex_3_13;

import javax.swing.JOptionPane;

public class Q8 {

	public static void main(String[]args){
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		
		   for (int a = 1; a <= num; a++){ 
		    
			   for (int b = 1; b <= a; b++){ 
		     
				   System.out.print((a*b) + " "); 
			   }
		    System.out.println(""); 
		   }
	}
}
