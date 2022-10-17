package Ejercicio_Semana_3;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre\n");
        String nombre = sc.nextLine();
        System.out.println("¿De dónde eres?\n");
        String localidad = sc.nextLine();
        System.out.println("¿Qué te gusta hacer?\n");
        String aficion = sc.nextLine();
        System.out.println("Hola, mi nombre es " + nombre + ", soy de " + localidad + " y me gusta " + aficion);
    }
}
