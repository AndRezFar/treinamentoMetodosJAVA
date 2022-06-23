package OrientacaoAObjeto;

import java.util.Scanner;

public class Calculadora {
	
	public static void calculadora(int a, int b) {
		Scanner op = new Scanner(System.in);
		System.out.println("Informe o operador:");
		System.out.println("1- Soma;");
		System.out.println("2- Subtracao;");
		System.out.println("3- Multiplicacao;");
		System.out.println("4- divisao.");
		int operacao = op.nextInt();
		switch (operacao) {
			case 1:
				System.out.println(a + b);
				break;
			case 2:
				System.out.println(a - b);
				break;
			case 3:
				System.out.println(a * b);
				break;
			case 4:
				if (b == 0) {
					System.out.println("A variavel b nao pode ser 0");
				} else {
					System.out.println(a / b);
				}
				break;
			default:
				System.out.println("Opcao invalida");
				break;
		}
	}

}
