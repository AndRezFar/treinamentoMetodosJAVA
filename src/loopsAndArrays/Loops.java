package src.loopsAndArrays;

import java.util.*;

public class Loops {

    private static void nomeIdadeAluno(){
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        int idade;
        while (true) {
            System.out.println("Digite o nome do aluno:");
            nome = scanner.next();
            if(nome.equals("0"))
                break;
            System.out.println("Digite a idade do aluno:");
            idade = scanner.nextInt();
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
    }

    private static void nota(){
        Scanner scanner = new Scanner(System.in);
        float nota;
        while (true){
            System.out.println("Digite o valor da nota: ");
            nota = scanner.nextFloat();
            if(nota >= 0 && nota <= 10) {
                System.out.println("Nota: " + nota);
                break;
            }
            System.out.println("Nota invalida");
        }
    }

    private  static void media(){
        Scanner scanner = new Scanner(System.in);

        int valor;
        int count = 0;
        int media = 0;
        int maior = 0;

        do{
            System.out.println("digite o valor: ");
            valor = scanner.nextInt();
            if(maior < valor){
                maior = valor;
            }
            media = media + valor;

            count++;
        }while (count < 5);

        media = media/count;
        System.out.println("A media dos numeros e: " + media);
        System.out.println("O maior numero e: " + maior);
    }

    private static void imparPar(){
        Scanner scanner = new Scanner(System.in);

        int quantidade;
        int numero;
        int count = 0;
        int totalImpar = 0;
        int totalPar = 0;

        System.out.println("Digite a quantidades de numeros que sera inserido: ");
        quantidade = scanner.nextInt();

        do{
            System.out.println("Digite o numero: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0 ){
                totalPar++;
            } else {
                totalImpar++;
            }

            count++;
        } while(count < quantidade);

        System.out.println("Qauntidade pares: " + totalPar);
        System.out.println("Qauntidade pares: " + totalImpar);
    }

    private static void tabuada(){
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o número da tabuada: ");
        int multiplicador = scan.nextInt();

        for(int a = 0; a <= 10; a++){
            System.out.println(multiplicador + " x " + a + " = " + (a * multiplicador));
        }

    }

    private static void fatorial(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do fatorial: ");
        int numFatorial = scan.nextInt();
        int calculo = 0;

        for(int a = numFatorial; a > 1; a--){
            calculo = numFatorial * (a-1);
            numFatorial = calculo;

        }

        System.out.println("Fatotial é: " + numFatorial);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Escola uma das seguintes opcoes: ");
            System.out.println("1- Nome e Idade do aluno;");
            System.out.println("2- Notas;");
            System.out.println("3- Media;");
            System.out.println("4- Contador de Par e Impar;");
            System.out.println("5- Tabuada;");
            System.out.println("6- Fatorial;");
            System.out.println("7- Sair.");

            int z = scan.nextInt();

            switch (z) {
                case 1:
                    nomeIdadeAluno();
                    break;
                case 2:
                    nota();
                    break;
                case 3:
                    media();
                    break;
                case 4:
                    imparPar();
                    break;
                case 5:
                    tabuada();
                    break;
                case 6:
                    fatorial();
                    break;
                case 7:
                    System.out.println("Obrigado!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
            if (z == 7){
                break;
            }
        }while (true);


    }
}
