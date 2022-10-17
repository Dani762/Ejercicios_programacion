package Ejercicio_Semana_3;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dame el número del que quieras saber la tabla");
            int n1 = sc.nextInt();

            for(int i = 1; i <= 10; ++i) {
                System.out.println("Tabla de multiplicar del " + n1 + "-" + n1 + "*" + i + " = " + n1 * i);
            }

        }
}
