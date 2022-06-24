package orientacaoAObjeto;
import java.util.Scanner;

public class Emprestimo {
	
	public static double calculoValor(double valorEmprestimo, double parcelas) {
		double calculoParcelas = valorEmprestimo / parcelas; 
		double calculoJuros = calculoParcelas*0.05;
		double valorTotal = calculoJuros + calculoParcelas;
		
		return valorTotal;
	}
	
	public static void emprestimo(int salario) {
		Scanner quantidadeParcelas = new Scanner(System.in);
		if (salario <= 1500) {
			double valorEmprestimo = salario*3;
			System.out.println("O calor disponivel para o emprestimo �: " + valorEmprestimo);
			System.out.println("Informe a quantidade de parcelas");
			double parcelas = quantidadeParcelas.nextDouble();
			System.out.println("O valor de cada parcela fica por: " + calculoValor(valorEmprestimo, parcelas));
		} else if(salario <= 3500) {
			double valorEmprestimo = salario*5;
			System.out.println("O calor disponivel para o emprestimo �: " + valorEmprestimo);
			System.out.println("Informe a quantidade de parcelas");
			double parcelas = quantidadeParcelas.nextDouble();
			System.out.println("O valor de cada parcela fica por" + calculoValor(valorEmprestimo, parcelas));
		} else {
			double valorEmprestimo = salario*7;
			System.out.println("O calor disponivel para o emprestimo �: " + valorEmprestimo);
			System.out.println("Informe a quantidade de parcelas");
			double parcelas = quantidadeParcelas.nextDouble();
			System.out.println("O valor de cada parcela fica por" + calculoValor(valorEmprestimo, parcelas));
		}
	}

}
