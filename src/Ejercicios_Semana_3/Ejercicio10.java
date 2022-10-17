package Ejercicio_Semana_3;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer valor");
        int n1 = sc.nextInt();
        System.out.println("Dame el segundo valor");
        int n2 = sc.nextInt();
        System.out.println("Dame el tercer valor");
        int n3 = sc.nextInt();
        if (n1 != n2 && n1 != n3 && n2 != n3) {
            System.out.println("No hay ningún valor idéntico");
        } else {
            System.out.println("Hay valores idénticos");
        }
    }
}
