package Ejercicios_Semana_4;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Dame un número y te diré si es par o impar");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if(numero % 2 == 0){
            System.out.println(numero+" es un número par");

        }
        else{
            System.out.println(numero+" es un número impar");
        }
    }
}
