package sintaxe_variaveis_e_fluxo;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int fatorial = 1;
		
		System.out.println("Calculador de Fatorial");
		
		System.out.println("Digite o valor: ");
		int n = scan.nextInt();


		for (int i = n; i > 1; i--) {
			fatorial = fatorial * i;
		}

		System.out.println("O fatorial de " + n + " igual a " + fatorial);
	}

}
