package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {
	
	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 65; //compila normalmente
		System.out.println(valor);//imprime A
		
		//char valor = valor + 1; nao compila porque o java transforma o resultado para o maior tipo, no caso para int
		
		valor = (char)(valor + 1);//com o casting compila
		System.out.println(valor); // imprime B
		
		String palavra = "Alura cursos online de tecnologias ";
		System.out.println(palavra);//imprime "Alura cursos online de tecnologias "
		
		palavra = palavra + 2021;
		System.out.println(palavra); // "imprime Alura cursos online de tecnologias 2021"
	}

}
