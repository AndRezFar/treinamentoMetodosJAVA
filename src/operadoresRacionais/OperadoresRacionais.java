package operadoresRacionais;

public class OperadoresRacionais {

    public static void main(String[] args) {

        int salarioMensal = 2200;
        int quantidadeDependentes = 4;
        int mediaSalaraio = 1200;
        int mediaDependentes = 3;

        int salarioBaixo = 1200;
        int muitosDependestes = 6;



        boolean recebeAuxilio = (salarioMensal < mediaSalaraio) && (quantidadeDependentes >= muitosDependestes);

        System.out.println(recebeAuxilio);

    }

}
