package interfaces_10_5;

public class Teste {

	public static void main(String[]args){
		AreaCalculavel a = new Retangulo(3,2);
		AreaCalculavel b = new Quadrado(2); 
		AreaCalculavel c = new Circulo(2); 
		
		System.out.println("Área do retângulo: " + a.calcularArea());
		System.out.println("Área do quadrado: " + b.calcularArea());
		System.out.println("Área do círclulo: " + c.calcularArea());

	}
}
