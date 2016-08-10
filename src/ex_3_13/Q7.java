package ex_3_13;

//import javax.swing.JOptionPane;

public class Q7 {

	public static void main(String[]args){
		int x = 13;/*Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));*/
		
		while (x > 1){
			if(x % 2 == 0){
				 x = x/2;			
				System.out.println(x);
						
			}else{
				 x = 3 * x + 1;
				System.out.println(x);
			}
		}
	}
}
