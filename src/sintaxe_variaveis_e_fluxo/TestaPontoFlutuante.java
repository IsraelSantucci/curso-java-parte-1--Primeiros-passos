package sintaxe_variaveis_e_fluxo;

public class TestaPontoFlutuante {

	public static void main(String[] args) {
		
		double salario = 1250.30;
		
		System.out.println("meu salario: " + salario);
		
		// int saldo = salario; // nao compila, um valor double nao cabe dentro de um int
		
		//int teste1 = 0.0; nao compila
		
		int divisao = 5 / 2 ;
		System.out.println(divisao); //imprime 2
		
		double divisao2 = 5 / 2;
		System.out.println(divisao2); //imprime 2
		
		double divisao3 = 5.0 / 2;
		System.out.println(divisao3); //imprime 2.5
		
	}

}
