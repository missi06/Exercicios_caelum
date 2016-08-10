package variaveis_primitivas;

public class BalancoTrimestral {

	public static void main(String[]args){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		int mediaMensal = gastosTrimestre/3;
		
		System.out.println("Gastos do trimeste foi de: R$ " + gastosTrimestre + 
				"\nValor da média mensal = " + mediaMensal);
		
	}
}
