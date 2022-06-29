package src.collectionsList;

import java.util.*;


public class ListCollection {
    public static void main(String[] args) {

        System.out.println("ATIVIDADE 1: ");
        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("ATIVIDADE 2: ");
        System.out.println("Exiba a posicao da nota 5.0: ");
        System.out.println(notas.indexOf(5d));

        System.out.println("ATIVIDADE 3: ");
        System.out.println("Adicione na lista a nota 8.0 na posicao 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("ATIVIDADE 4: ");
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        System.out.println("ATIVIDADE 5: ");
        System.out.println("Confira se a nota 5.0 esta na lista: ");
        System.out.println(notas.contains(5d)); // retornara um booleano.

        System.out.println("ATIVIDADE 6: ");
        System.out.println("Exiba a terceira nota adicionada: ");
        System.out.println(notas.get(2));

        System.out.println("ATIVIDADE 7: ");
        System.out.println("Exiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println("ATIVIDADE 8: ");
        System.out.println("Exiba a maior nota: ");
        System.out.println(Collections.max(notas));

        System.out.println("ATIVIDADE 9: ");
        System.out.println("Exiba a soma das notas: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("ATIVIDADE 10: ");
        System.out.println("Exiba a media das notas: ");
        System.out.println(soma/notas.size());

        System.out.println("ATIVIDADE 11: ");
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("ATIVIDADE 12: ");
        System.out.println("Remova a nota da posicao 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("ATIVIDADE 13: ");
        System.out.println("Remova as notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("ATIVIDADE 14: ");
        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("ATIVIDADE 15: ");
        System.out.println("Confira se a lista esta vazia: ");
        System.out.println(notas.isEmpty());
    }
}
