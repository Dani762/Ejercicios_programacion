package Ejercicio_Semana_3;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer número");
        int n1 = sc.nextInt();
        System.out.println("Dame el segundo número");
        int n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Los números son iguales");
        } else {
            System.out.println("Los números no son iguales");
        }

    }
}
