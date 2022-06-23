package MetodosJava;

import java.util.Scanner;

public class SobrecargaReturn {

    public static float calculoQuadrilatero(float lateral){
        float a;
        a = lateral * lateral;

        return a;
    }

    public static float calculoQuadrilatero(float base, float altura){
        float a;
        a = base * altura;

        return a;
    }

    public static float calculoQuadrilatero(float base1, float base2, float altura){
        float a;
        a = (base1 + base2) / 2 * altura;

        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //caluclo da area de um quadrado

        System.out.println("Digite o valor da base do quadrado:");
        float baseQuadrado = scanner.nextFloat();
        System.out.println("**O valor da area do Quadrado e: " + calculoQuadrilatero(baseQuadrado) + "**");

        //calculo da area de um retângulo

        System.out.println("Digite o valor da base do retangulo:");
        float baseRetangulo = scanner.nextFloat();
        System.out.println("digite o valor da altura do retangulo:");
        float alturaRetangulo = scanner.nextFloat();
        System.out.println("**O valor da area do Retangulo e: " + calculoQuadrilatero(baseRetangulo, alturaRetangulo) + "**");

        //calculo da area de um trapézio

        System.out.println("Digite o valor da base A do trapezio:");
        float baseTrapezio1 = scanner.nextFloat();
        System.out.println("Digite o valor da base B do trapezio:");
        float baseTrapezio2 = scanner.nextFloat();
        System.out.println("digite o valor da altura do trapezio:");
        float alturaTrapezio = scanner.nextFloat();
        System.out.println("**O valor da area do Trapezio e: " + calculoQuadrilatero(baseTrapezio1, baseTrapezio2, alturaTrapezio) + "**");
    }

}
