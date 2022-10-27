package Ejercicios_Semana_5;
import java.util.Scanner;



public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Dame el primer número");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Dame el segundo número");
        int n2 = sc.nextInt();
        int resultado = n1%n2;
        boolean b = resultado == 0;
        System.out.println(b);


    }
}
