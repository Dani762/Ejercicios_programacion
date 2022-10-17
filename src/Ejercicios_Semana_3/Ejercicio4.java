package Ejercicio_Semana_3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la altura del triángulo\n");
        int h = sc.nextInt();
        System.out.println("Dame la base del triángulo\n");
        int b = sc.nextInt();
        System.out.println("El área del triángulo es: " + h * b / 2);
    }
}
