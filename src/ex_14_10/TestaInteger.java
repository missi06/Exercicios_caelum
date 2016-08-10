package ex_14_10;

public class TestaInteger {

	public static void main(String[]args){
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		if (x1.equals(x2)) {
		System.out.println("igual [com equals]");
		} else {
		System.out.println("\ndiferente [com equals]");
		}
		
		if (x1 == x2) {
			System.out.println("\nigual [sem equals]");
			} else {
			System.out.println("\ndiferente [sem equals]");
			}
	}
}
