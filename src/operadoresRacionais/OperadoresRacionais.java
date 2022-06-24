package operadoresRacionais;

public class OperadoresRacionais {

    public static void main(String[] args) {

        int salarioMensal = 2200;
        int quantidadeDependentes = 4;
        int mediaSalaraio = 1200;
        int mediaDependentes = 3;

        boolean salarioBaixo = salarioMensal < mediaSalaraio;
        boolean muitosDependestes = quantidadeDependentes >= mediaDependentes;



        boolean recebeAuxilio = (salarioBaixo) && (muitosDependestes);

        System.out.println(recebeAuxilio);

    }

}
