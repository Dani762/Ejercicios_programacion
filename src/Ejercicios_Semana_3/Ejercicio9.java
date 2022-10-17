package Ejercicio_Semana_3;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una frase");
        String Frase1 = sc.nextLine();
        System.out.println("Dame otra frase");
        String Frase2 = sc.nextLine();
        if (Frase1.equals(Frase2)) {
            System.out.println("Las frases son idénticas");
        } else {
            System.out.println("las frases son diferentes");
        }

    }
}
