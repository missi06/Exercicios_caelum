package ex_16_15;

import java.util.*;
public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		for (int i = 0; i < total; i++) {
		teste.add(i);
		}
		
			long fim1 = System.currentTimeMillis();
			long tempo1 = fim1 - inicio;
			System.out.println("Tempo gasto [armazena]: " + tempo1);
		
		//////////
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
			long fim = System.currentTimeMillis();
			long tempo = fim - inicio;
			System.out.println("Tempo gasto [busca]: " + tempo);
		}

}
