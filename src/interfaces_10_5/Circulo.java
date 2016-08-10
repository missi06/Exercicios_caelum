package interfaces_10_5;

public class Circulo implements AreaCalculavel{

	private int raio;
	
	public Circulo(int raio){
		this.raio = raio;
	}
	public double calcularArea(){
		return Math.PI * this.raio * this.raio;
	}
}
