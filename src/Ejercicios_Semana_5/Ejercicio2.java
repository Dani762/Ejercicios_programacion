package Ejercicios_Semana_5;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Dame un número menor que 100");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        boolean primo = false;
        if (numero == 0 || numero == 4) {
            System.out.println("El número no es primo");
        }
        if (numero < 100) {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    i = numero;

                }else{
                    primo = true;
                }
            }
            System.out.println(primo);
        } else {
            System.out.println("El número es mayor que 100, por lo que no puedo realizar la operación");
        }

    }
}
