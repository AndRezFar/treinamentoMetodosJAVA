package src.colletionsSet;

import java.util.*;

public class SetOrdenacao {

    public static void main(String[] args) {
        System.out.println("1- Ordem aleatoria: ");
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("got","fantasia", 60));
            add(new Serie("dark","drama", 60));
            add(new Serie("that '70s show","comedia", 30));
        }};
        for(Serie serie: minhasSeries){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("2- Ordem insercao: ");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
           add(new Serie("Naruto", "Anime", 25));
           add(new Serie("Damon Slayer", "Anime", 30));
           add(new Serie("Darlin in the fraxx", "Anime", 25));
        }};
        for(Serie serie: minhasSeries1){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("3- Ordem natural (TempoEpisodio): ");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for(Serie serie : minhasSeries2){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("4- Ordem Nome/Genero/Tempo Episodio: ");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries1);
        for(Serie serie : minhasSeries3){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("5- Ordem Genero: ");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries1);
        for(Serie serie : minhasSeries4){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("6- Ordem tempo episodio: ");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries5.addAll(minhasSeries1);
        for(Serie serie : minhasSeries5){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

    }

}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        int genero = this.getGenero().compareToIgnoreCase(serie.getGenero());
        int nome = this.getNome().compareToIgnoreCase(serie.getNome());
        if(tempoEpisodio != 0) {
            return tempoEpisodio;
        }else if(genero != 0) {
            return genero;
        }else {
            return nome;
        }
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareToIgnoreCase(s2.getNome());
        int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
        int tempoEpisodio = Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        if(nome != 0){
            return nome;
        } else if(genero != 0){
            return genero;
        }else {
            return tempoEpisodio;
        }

    }
}

class ComparatorGenero implements Comparator<Serie>{

    @Override
    public int compare(Serie o1, Serie o2) {
        int genero = o1.getGenero().compareToIgnoreCase(o2.getGenero());
        if(genero != 0) return genero;
            return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}

class ComparatorTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie o1, Serie o2) {
        int tempo = Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());
        if(tempo != 0) return tempo;
        return o1.getGenero().compareToIgnoreCase(o2.getGenero());
    }
}