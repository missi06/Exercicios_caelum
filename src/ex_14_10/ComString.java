package ex_14_10;

public class ComString {

	String palavra;
	String texto;
	String frase;
	String palavrasString = "";
	
	
	    
	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	/////	Quest12
	public void Q12(){
		    for(int i = 0; i < palavra.length(); i++){
	      System.out.print(palavra.charAt(i) + "\n");
	    }
	}
	
	/////	Quest13
	public void Q13(){
		for (int i = texto.length()-1; i >= 0; i--) {
			   System.out.print(texto.charAt(i));
			  }
	}
	
	/////	Quest14 
	public void Q14(){
		
		String[] palavrasArray = this.frase.split(" "); 
		
		for (int i = palavrasArray.length - 1; i >= 0; i--) {
		    	    palavrasString += palavrasArray[i] + ' ';
		    	   
		}

		System.out.println("String: " + palavrasString);
		
	}
	
}
