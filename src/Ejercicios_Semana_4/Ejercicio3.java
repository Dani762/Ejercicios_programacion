package Ejercicios_Semana_4;
import java.util.Scanner;
import java.lang.String;
public class Ejercicio3 {
    public static void main(String[] args) {
        float leche = 3.5F;
        float cacao = 3F;
        int avellanas = 4;
        float azucar = 0.89F;
        System.out.println("¿De qué producto quiere conocer el precio? \nLeche  \nCacao \nAvellanas \nAzúcar");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        switch (a) {
            case "Leche":
                System.out.println("La leche cuesta "+leche+"€");
                break;
            case "Cacao":
                System.out.println("El cacao cuesta "+cacao+"€");
                break;
            case "Avellanas":
                System.out.println("Las avellanas cuestan "+avellanas+"€");
                break;
            case "Azúcar":
                System.out.println("El azúcar cuesta "+azucar+"€");
        }
    }
}