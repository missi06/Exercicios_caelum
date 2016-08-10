package ex_14_10;

public class Q2_String_espaco_branco {

	public static void main(String[]args){
		String nome = "M  is  s   i l  e  ne";
		
		nome = nome.replaceAll(" ", "");
		System.out.println(nome);
		
		
	}
}
