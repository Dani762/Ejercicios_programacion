package Ejercicios_Semana_4;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número");
        int x = sc.nextInt();
        if (x>=10){
            System.out.println("El número es mayor o igual que 10");
        }
        else {
            System.out.println("El número es menor que 10");
        }



    }
}
