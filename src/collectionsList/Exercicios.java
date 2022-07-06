package src.collectionsList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        System.out.println("Exercicio 1: ");
        List<Integer> temperatura = new ArrayList<Integer>();

        temperatura.add(23);
        temperatura.add(24);
        temperatura.add(23);
        temperatura.add(21);
        temperatura.add(19);
        temperatura.add(17);
        System.out.println("Etapa 1: ");
        System.out.println(temperatura.toString());

        Iterator<Integer> iterator = temperatura.iterator();
        double soma = 0d;
        while (iterator.hasNext()){
            int next = iterator.next();

            soma += next;
        }
        double media = soma/6;

        System.out.println("Etapa 2: ");
        for (int temp: temperatura) {
            if (temp > media) {
                int index = temperatura.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println("1- Janeiro = " + temp);
                        break;
                    case 1:
                        System.out.println("2- Fevereiro = " + temp);
                        break;
                    case 2:
                        System.out.println("3- Marco = " + temp);
                        break;
                    case 3:
                        System.out.println("4- Abril = " + temp);
                        break;
                    case 4:
                        System.out.println("5- Maio = " + temp);
                        break;
                    case 5:
                        System.out.println("6- Junho = " + temp);
                        break;
                    default:
                        break;
                }
            }
        }

        System.out.println("Etapa 3: ");
        System.out.println(media);

        System.out.println("Exercicio 2: ");

        System.out.println("Etapa 1:");
        Scanner scan = new Scanner(System.in);
        List<Integer> resposta = new ArrayList<Integer>();

        System.out.println("Telefonou para a vitima? ");
        System.out.println("1- SIM");
        System.out.println("2- NAO");
        resposta.add(scan.nextInt());

        System.out.println("Esteve no local do crime? ");
        System.out.println("1- SIM");
        System.out.println("2- NAO");
        resposta.add(scan.nextInt());

        System.out.println("Mora perto da vitima? ");
        System.out.println("1- SIM");
        System.out.println("2- NAO");
        resposta.add(scan.nextInt());

        System.out.println("Devia para a vitima? ");
        System.out.println("1- SIM");
        System.out.println("2- NAO");
        resposta.add(scan.nextInt());

        System.out.println("Ja trabalhou com a vitima? ");
        System.out.println("1- SIM");
        System.out.println("2- NAO");
        resposta.add(scan.nextInt());

        int count = 0;
        for(int res : resposta){
            if(res == 1){
                count++;
            }
        }

        if(count == 2){
            System.out.println("Suspeita");
        } else if(count == 3 || count == 4){
            System.out.println("Cumplice");
        } else if(count == 5){
            System.out.println("Assasina");
        } else {
            System.out.println("Inocente");
        }
    }
}
