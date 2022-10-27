package Ejercicios_Semana_5;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        class figura {
            double lado;
            double altura;
        }
        figura cuadrilatero = new figura();
        cuadrilatero.lado = 2.0;
        cuadrilatero.altura = 5.0;
        double res = calculoArea(cuadrilatero.lado, cuadrilatero.altura);
        System.out.println("El resultado es " + res);



    }

    public static double calculoArea(double a, double b) {
        double resultado = a*b;
        return resultado;
    }


}







