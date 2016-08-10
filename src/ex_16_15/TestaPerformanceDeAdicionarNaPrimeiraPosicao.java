package ex_16_15;

import java.util.*;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();
		
		
		List<Integer> teste = new ArrayList<>();
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		
		long fim = System.currentTimeMillis();		
		double tempo = (fim - inicio) / 1000.0;
		
		System.out.println("Tempo gasto [ArrayList]: " + tempo);
		
		////////~~~~~~~~~~/////////
		List<Integer> teste2 = new LinkedList<>();
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		
		long fim2 = System.currentTimeMillis();		
		double tempo2 = (fim2 - inicio) / 1000.0;
		
		System.out.println("Tempo gasto [LinkedList]: " + tempo2);

	}
}
