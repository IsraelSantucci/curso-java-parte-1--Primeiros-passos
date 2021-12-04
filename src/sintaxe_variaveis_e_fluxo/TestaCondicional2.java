package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 18;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;

		System.out.println("Teste 1");

		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Pode entrar, seja bem-vindo!!");
		} else {
			System.out.println("Infelizmente voce nao pode entrar");
		}

		System.out.println("Teste 2");

		// So entra se for maior que 18 e estar acompanhado
		if (idade >= 18 && acompanhado) {
			System.out.println("Pode entrar, seja bem-vindo!!");
		} else {
			System.out.println("Infelizmente voce nao pode entrar");
		}

	}
}
