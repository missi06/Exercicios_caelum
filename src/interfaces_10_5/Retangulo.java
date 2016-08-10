package interfaces_10_5;

public class Retangulo implements AreaCalculavel{

	private int largura;
	private int altura;
	
	public Retangulo(int largura, int altura){
		this.largura = largura;
		this.altura = altura;
	}
	public double calcularArea(){
		return this.largura * this.altura;
	}

}
