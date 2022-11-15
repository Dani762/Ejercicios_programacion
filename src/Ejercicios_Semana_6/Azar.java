package Ejercicios_Semana_6;

import java.util.Scanner;

public class Azar {
    public int aleatorio(Scanner sc) {
        System.out.println("Te voy a dar un número al azar, pero necesito que me des un número máximo y un número mínimo");
        System.out.println("Dame el mínimo");
        int minimo = sc.nextInt();
        System.out.println("Dame el máximo");
        int maximo = sc.nextInt();
       int aleatorio = (int) (Math.random() * (maximo - minimo) + minimo);
        return aleatorio;
    }
}
