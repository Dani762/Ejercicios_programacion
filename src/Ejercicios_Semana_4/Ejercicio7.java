package Ejercicios_Semana_4;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Dime una frase, y te diré si la cantidad de caracteres que la forman son pares o impares");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        if(frase.length()%2 == 0){
            System.out.println("La cantidad de caracteres forman un número par");
        }
        else{
            System.out.println("La cadena de caracteres forman un número impar");
        }

    }
}
