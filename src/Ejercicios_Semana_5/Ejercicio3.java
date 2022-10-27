package Ejercicios_Semana_5;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        String frase;
        System.out.println("Dime una frase, te mostraré por pantalla las letras una a una");
        Scanner sc = new Scanner (System.in);
        frase = sc.nextLine();
        for (int i=0; i<frase.length();i++) {
            System.out.println(frase.charAt(i));
        }


    }
}
