package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais");

		int idade = 11;
		int quantidadePessoas = 1;

		if (idade >= 18) {
			System.out.println("voc� tem mais que 18 anos.");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� nao tem 18, mas pode entrar " + "por estar acompanhado");
			} else {
				System.out.println("infelizmente voc� nao pode entrar");
			}
		}
	}
}
