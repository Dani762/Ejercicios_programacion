package Ejercicio_Semana_3;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = sc.nextInt();
        String resultado = edad >= 18 ? "Puedes sacarte el carnet de conducir:" : "No puedes sacarte el carnet de conducir";
        System.out.println(resultado);
    }
}
