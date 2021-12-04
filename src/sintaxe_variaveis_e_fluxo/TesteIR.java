package sintaxe_variaveis_e_fluxo;

public class TesteIR {

	public static void main(String[] args) {

		// De 1900.0 até 2800.0 o IR é de 7.5% e pode deduzir R$ 142
		// De 2800.01 até 3751.0 o IR é de 15% e pode deduzir R$ 350
		// De 3751.01 até 4664.00 o IR é de 22.5% e pode deduzir R$ 636

		double salario = 3300.0;
		double imposto = 0;
		double valorDeduzir = 0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			imposto = salario * 0.075; // 7.5%
			valorDeduzir = 142;
		} else if (salario >= 2800.01 && salario <= 3751.00) {
			imposto = salario * 0.15; // 15%
			valorDeduzir = 350;
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			imposto = salario * 0.225; // 22.5%
			valorDeduzir = 636;
		}

		System.out.println("Salario: " + salario);
		System.out.println("IR: " + imposto);
		System.out.println("Valor a deduzir: " + (int) valorDeduzir);
	}

}
