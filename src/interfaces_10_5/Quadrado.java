package interfaces_10_5;

public class Quadrado implements AreaCalculavel {

	private int lado;
	
	public Quadrado(int lado){
		this.lado = lado;
	}
	
	public double calcularArea(){
		return this.lado * this.lado;
		
	}

	
}
