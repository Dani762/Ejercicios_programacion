package Ejercicios_Semana_6;

import java.util.Scanner;

public class Juego {
    public static boolean azar(int NumeroUsuario, Scanner sc){
        int aleatorio = (int) (Math.random() * 100);
        boolean acertar = false;
        while (acertar = true){
            if (NumeroUsuario > aleatorio){
                System.out.println("El número que me das es mayor que el que debes adivinar");
                System.out.println("Dame otro número");
                NumeroUsuario = sc.nextInt();
            }else{
                System.out.println("El número que me das es menor que el que debes adivinar");
                System.out.println("Dame otro número");
                NumeroUsuario = sc.nextInt();
            }
            if(NumeroUsuario == aleatorio){
                System.out.println("Has adivinado el número");
                acertar = false;
                break;
            }
        }

        return acertar;
    }
}
