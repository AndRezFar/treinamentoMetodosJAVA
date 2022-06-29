package src.loopsAndArrays;

import java.util.Random;
import java.util.Scanner;

public class Arrays {

    private static void arrayInverso(){
        Scanner scan = new Scanner(System.in);

        int[] vetor = {5, -8, 87, 418, -785, 85};

        System.out.print("Vetor: ");
        for(int i = 0; i <= (vetor.length - 1); i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nVetor inverso: ");
        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }

    private static void consoante(){
        Scanner scan = new Scanner(System.in);

        String[] consoante = new String[6];
        int quantConsoantes = 0;

        int count = 0;
        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if(!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))){
                consoante[count] = letra;
                quantConsoantes++;
            }
            count++;

        } while (count < consoante.length);

        System.out.println("O numero de consoantes: " + quantConsoantes);

        System.out.print("consoantes: ");
        for (String consoantes : consoante) {
            if( consoantes != null) {
                System.out.print(consoantes + " ");
            }
        }
    }

    private static void numerosAleatorios(){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[] numAleat = new int[20];

        for(int i = 0; i < numAleat.length; i++){
            int num = random.nextInt(100);
            numAleat[i] = num;
        }

        System.out.print("Numeros Aleatorios: ");
        for (int aleatorios : numAleat) {
            System.out.print(aleatorios + " ");
        }

        System.out.print("\nSucessores dos numeros Aleatorios: ");
        for (int aleatorios : numAleat) {
                System.out.print((aleatorios + 1) + " ");
        }

        System.out.print("\nAntecessor dos numeros Aleatorios: ");
        for (int aleatorios : numAleat) {
            System.out.print((aleatorios - 1) + " ");
        }

    }

    private static void arrayMultidimensional(){
        Random random = new Random();

        int[][] multidimencional = new int[4][4];

        for(int i = 0; i < multidimencional.length; i++){
            for(int z = 0; z < multidimencional[i].length; z++) {
                multidimencional[i][z] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : multidimencional){
            for (int coluna : linha){
                System.out.print("|" + coluna + "|");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("\nEscola uma das seguintes opcoes: ");
            System.out.println("1- Array inverso;");
            System.out.println("2- Consoante;");
            System.out.println("3- Numeros Aleatorios;");
            System.out.println("4- Array Multidimensional;");
            System.out.println("5- Sair.");

            int z = scan.nextInt();

            switch (z) {
                case 1:
                    arrayInverso();
                    break;
                case 2:
                    consoante();
                    break;
                case 3:
                    numerosAleatorios();
                    break;
                case 4:
                    arrayMultidimensional();
                    break;
                case 5:
                    System.out.println("Obrigado!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
            if (z == 5){
                break;
            }
        }while (true);

    }
}
