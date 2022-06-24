package logicaCondicionalEControleDeFluxo;

class ControleDeFluxo {

    public static void main(String[] args) {
        int mesDoAno = 12;

        if (mesDoAno == 1) {
            System.out.println("Janeiro");
        } else if (mesDoAno == 2) {
            System.out.println("Fevereiro");
        } else if (mesDoAno == 3) {
            System.out.println("Marco");
        } else if (mesDoAno == 4) {
            System.out.println("Abril");
        } else if (mesDoAno == 5) {
            System.out.println("Maio");
        } else if (mesDoAno == 6) {
            System.out.println("Junho");
        } else if (mesDoAno == 7) {
            System.out.println("Julho");
        } else if (mesDoAno == 8) {
            System.out.println("Agosto");
        } else if (mesDoAno == 9) {
            System.out.println("Setembro");
        } else if (mesDoAno == 10) {
            System.out.println("Outubro");
        } else if (mesDoAno == 11) {
            System.out.println("Novembro");
        } else if (mesDoAno == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Numero do mes invalido!");
        }

        if (mesDoAno == 1 || mesDoAno == 7 || mesDoAno == 12) {
            System.out.println("Ferias");
        }

        String diaDaSemana = "Segunda";

        switch (diaDaSemana) {
            case "Domingo":
                System.out.println("1");
                System.out.println("certo");
                break;
            case "Segunda":
                System.out.println("2");
                System.out.println("certo");
                break;
            case "Terca":
                System.out.println("3");
                System.out.println("certo");
                break;
            case "Quarta":
                System.out.println("4");
                System.out.println("Errado");
                break;
            case "Quinta":
                System.out.println("5");
                System.out.println("Talvez");
                break;
            case "Sexta":
                System.out.println("6");
                System.out.println("Indefinido");
                break;
            case "Sabado":
                System.out.println("7");
                System.out.println("Indefinido");
                break;
            default:
                System.out.println("Indefinido");
        }

    }

}
