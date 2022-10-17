package Ejercicio_Semana_3;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer valor para incrementarlo en 1");
        int n1 = sc.nextInt();
        ++n1;
        System.out.println("Dame el segundo valor para multiplicar");
        int n2 = sc.nextInt();
        int resultado = n1 * n2;
        System.out.println("El resultado es " + resultado);
    }
}
