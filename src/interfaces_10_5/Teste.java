package interfaces_10_5;

public class Teste {

	public static void main(String[]args){
		AreaCalculavel a = new Retangulo(3,2);
		AreaCalculavel b = new Quadrado(2); 
		AreaCalculavel c = new Circulo(2); 
		
		System.out.println("�rea do ret�ngulo: " + a.calcularArea());
		System.out.println("�rea do quadrado: " + b.calcularArea());
		System.out.println("�rea do c�rclulo: " + c.calcularArea());

	}
}
