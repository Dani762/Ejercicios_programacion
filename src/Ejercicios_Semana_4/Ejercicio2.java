package Ejercicios_Semana_4;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase para detectar si contiene o no contiene una b");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        if (frase.contains("b")){
            System.out.println("La frase contiene la letra b");
        }
        else{
            System.out.println("La frase no contiene la letra b");
        }
    }
}
