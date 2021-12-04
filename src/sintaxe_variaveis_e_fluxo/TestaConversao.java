package sintaxe_variaveis_e_fluxo;

public class TestaConversao {

	public static void main(String[] args) {
		
		float pontoFlutuante = 3.14f;
		
		double salario = 1350.30;
		
		int salario2 = (int) salario;
		System.out.println(salario2); //imprime 1350 
		
		double valor  = 0.2;
		double valor2 = 0.1;
		
		double total = valor + valor2;
		
		System.out.println(total); //imprime 0.30000000000000004 devido essa inconsistencia o double nao é a melhor escolha pra se usar pra guardar salario.

	}

}
