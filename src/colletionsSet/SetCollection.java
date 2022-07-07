package src.colletionsSet;

import java.util.*;

public class SetCollection {

    public static void main(String[] args) {

        System.out.println("1- Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("2- Exiba a posicao da nota 5.0: ");
        // nao e possivel trabalhar com posicoes no HashSet porque ele fica de forma aleatoria

        System.out.println("3- Adicione na lista a nota 8.0 na posicao 4: ");
        // nao e possivel trabalhar com posicoes no HashSet porque ele fica de forma aleatoria

        System.out.println("4- Subtitua a nota 5.0 pela nota 6.0: ");
        // nao e possivel trabalhar com posicoes no HashSet porque ele fica de forma aleatoria

        System.out.println("5- Confira se a nota 5.0 esta no conjunto: ");
        System.out.println(notas.contains(5d));

        System.out.println("6- Exiba a tecerira nota adicionada: ");
        // nao e possivel trabalhar com posicoes no HashSet porque ele fica de forma aleatoria

        System.out.println("7- Exiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println("8- Exiba a maior nota: ");
        System.out.println(Collections.max(notas));

        System.out.println("9- Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;

        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println(soma);

        System.out.println("10- Exiba a media das notas: ");
        System.out.println(soma/notas.size());

        System.out.println("11- Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("12- Remova a nota na posicao 0: ");
        // nao e possivel trabalhar com posicoes no HashSet porque ele fica de forma aleatoria

        System.out.println("13- Remoca as notas menores que 7 e exiba a lista: ");

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("14- Remova todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("15- Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("16- Apague todo o conjunto: ");
        notas.clear();

        System.out.println("17- Confira se o conjunto esta vazio: ");
        System.out.println(notas.isEmpty());


    }

}
