package fixando_conhecimento_Orientacao_objetos;

public class Porta {

	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;

	void  abre(){
		aberta = true;
		System.out.print("A porta est� aberta!");
	}
	void fecha(){
		aberta = false;
		System.out.print("\nA porta est� fechada!");
	}
	void pinta(String s){
		System.out.print("\nA cor da porta �: " + s);
	}
	void tamanho(){
		System.out.print("\nAs dimens�es da porta s�o: " 
			+ this.dimensaoX + " X " + this.dimensaoY + " X " + this.dimensaoZ);
	}
	boolean estaAberta(){
		if(aberta == true){
			System.out.println("Sua porta est� aberta");
			return true;
		}else{
			System.out.println("Sua porta est� fechada");
			return false;
		}
		
	}
}
