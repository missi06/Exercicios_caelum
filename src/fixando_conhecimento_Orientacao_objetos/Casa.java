package fixando_conhecimento_Orientacao_objetos;

public class Casa {

	String cor;
	int porta1;
	int porta2;
	int porta3;
	
	void pinta(String s){
		System.out.print("\nA cor da casa �: " + s);
	}
	
	    int quantasPortasEstaoAbertas(){
	      int soma = porta1+ porta2+ porta3;
	      if( soma == 0){
	         System.out.println ( "Todas as portas est�o fechadas");
	      }
	      else{ 
	         System.out.println ("\n" + soma+"  portas est�o abertas ");
	      }
	  return soma;
	   }
}
