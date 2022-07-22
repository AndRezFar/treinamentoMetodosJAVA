package src.colletionsSet;

import java.security.spec.ECPrivateKeySpec;
import java.util.*;

public class ExercicioProposto {

    public static void main(String[] args) {

        System.out.println("A: ");
        Set<String> coresArcoIris = new HashSet<>(){{
        add(new String("Vermelho"));
        add(new String("Laranja"));
        add(new String("Amarela"));
        add(new String("Verde"));
        add(new String("Azul"));
        add(new String("Azul-escuro"));
        add(new String("Violeta"));
        }};

        for(String cor: coresArcoIris){
            System.out.println(cor);
        }

        System.out.println("B: ");
        System.out.println(coresArcoIris.size());

        System.out.println("C: ");
        Set<String> coresArcoIrisOrganizada = new TreeSet<>(coresArcoIris);
        coresArcoIrisOrganizada.addAll(coresArcoIris);
        for(String cor: coresArcoIrisOrganizada){
            System.out.println(cor);
        }

        System.out.println("D: ");
        List<String> coresArcoIrisReversa = new ArrayList<>();
        coresArcoIrisReversa.addAll(coresArcoIrisOrganizada);
        Collections.reverse(coresArcoIrisReversa);
        for(String cor: coresArcoIrisReversa){
            System.out.println(cor);
        }

        System.out.println("E: ");
        for (String cor: coresArcoIris) {
            if(cor.startsWith("V"))
                System.out.println(cor);
        }

        System.out.println("F: ");
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()){
            if(!iterator.next().startsWith("V")){
                iterator.remove();
            }
        }

        System.out.println("G: ");
        coresArcoIris.clear();

        System.out.println("H: ");
        System.out.println(coresArcoIris.isEmpty());

    }

}

