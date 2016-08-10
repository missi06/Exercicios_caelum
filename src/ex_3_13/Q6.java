package ex_3_13;

public class Q6 {

	static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
 
    public static void main(String[] args) {   
	
	// teste do programa. Imprime os 9 primeiros termos       
	for (int i = 0; i < 13; i++) {
            System.out.print(Q6.fibo(i) + "  ");
        }
 
    }
}
