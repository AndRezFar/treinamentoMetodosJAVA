package src.collectionsList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};
        System.out.println("(Atividade 1) ");
        System.out.println("Ordem de Insercao: ");
        System.out.println(meusGatos);

        System.out.println("(Atividade 2) ");
        System.out.println("Ordem Aleatoria: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("(Atividade 3) ");
        System.out.println("Ordem natual (nome): ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("(Atividade 4) ");
        System.out.println("Ordem Idade: ");
        Collections.sort(meusGatos, new ComparetorIdade());
        System.out.println(meusGatos);

        System.out.println("(Atividade 5) ");
        System.out.println("Ordem Cor: ");
        Collections.sort(meusGatos, new ComparetorCor());
        System.out.println(meusGatos);

        System.out.println("(Atividade 6) ");
        System.out.println("Ordem por Nome, Idade e Cor: ");
        meusGatos.sort(new ComparetorAll());
        System.out.println(meusGatos);

    }
}
 class Gato implements Comparable<Gato>{

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}

class ComparetorIdade implements Comparator<Gato>{
    @Override
    public int compare (Gato g1, Gato g2){
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparetorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparetorAll implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {

        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0){
            return nome;
        }

        int idade = g1.getIdade().compareTo(g2.getIdade());
        if(idade != 0){
            return idade;
        }

        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

