package OrientacaoAObjeto;

import java.util.Scanner;

public class AtivacaoDeTodosOsMetodos {
	public static void main(String[] args) {
		System.out.println("Escolha uma das opcoes:");
		System.out.println("1 - Calculadora;");
		System.out.println("2 - Calculo de emprestimo;");
		System.out.println("3 - Mensagem.");
		Scanner scanner = new Scanner(System.in);
		int opcaoEscolhida = scanner.nextInt();
		
		switch(opcaoEscolhida) {
		case 1:
			System.out.println("Informe a variavel A:");
			int variavelA = scanner.nextInt();
			System.out.println("Informe a variavel B:");
			int variavelB = scanner.nextInt();
			Calculadora.calculadora(variavelA, variavelB);
			System.out.println("FIM!");
			break;
		case 2:
			System.out.println("Informe o seu salario:");
			int salario = scanner.nextInt();
			Emprestimo.emprestimo(salario);
			System.out.println("FIM!");
			break;
		case 3:
			System.out.println("Informe a hora:");
			int horario = scanner.nextInt();
			MensagemDoDia.mensagemDoDia(horario);
			System.out.println("FIM!");
			break;
		default:
			System.out.println("Opcao invalida.");
		}
	}
}
