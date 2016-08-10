package fixando_conhecimento_Orientacao_objetos;

public class Porta {

	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;

	void  abre(){
		aberta = true;
		System.out.print("A porta está aberta!");
	}
	void fecha(){
		aberta = false;
		System.out.print("\nA porta está fechada!");
	}
	void pinta(String s){
		System.out.print("\nA cor da porta é: " + s);
	}
	void tamanho(){
		System.out.print("\nAs dimensões da porta são: " 
			+ this.dimensaoX + " X " + this.dimensaoY + " X " + this.dimensaoZ);
	}
	boolean estaAberta(){
		if(aberta == true){
			System.out.println("Sua porta está aberta");
			return true;
		}else{
			System.out.println("Sua porta está fechada");
			return false;
		}
		
	}
}
