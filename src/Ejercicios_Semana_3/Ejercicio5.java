package Ejercicio_Semana_3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double pi = Math.PI;
        int r = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el radio de la circunferencia\n");
        r = sc.nextInt();
        double a = pi * Math.pow((double)r, 2.0);
        double l = 2.0 * pi * (double)r;
        System.out.println("El área de la circunferencia es " + a + "\nLa longitud de la circunferencia es " + l);
    }
}
