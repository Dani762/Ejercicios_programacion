package Ejercicio_Semana_3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el número que quieres dividir ");
        int n1 = sc.nextInt();
        System.out.println("Dame el divisor");
        int n2 = sc.nextInt();
        System.out.println("El módulo del número es: " + n1 % n2);
    }
}
