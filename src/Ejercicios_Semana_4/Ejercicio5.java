package Ejercicios_Semana_4;
import java.io.*;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase, y detectaré si esta contiene una b o una v, y si existen, si hay una p o una u");
        String frase = sc.nextLine();
        boolean existeB = frase.contains("b");
        boolean existeV = frase.contains("v");
        if (existeB) {
            System.out.println("la b existe,voy a mirar si existe la p");
            boolean existeP = frase.contains("p");
            if (existeP) {
                System.out.println("La b y la p existen");
            } else {
                System.out.println("La b existe, pero no la p");
            }
        }else{
                System.out.println("No hay b, por tanto no comprobaré si hay p");
            }
        if (existeV) {
            System.out.println("La v existe, voy a mirar si existe la u");
            boolean existeU = frase.contains("u");
            if (existeU) {
                System.out.println("La v y la p existen");
            } else {
                System.out.println("La v existe, pero no la u");
                }
            }else{
            System.out.println("No hay v, por tanto no comprobaré si existe u");
        }
        }
}
