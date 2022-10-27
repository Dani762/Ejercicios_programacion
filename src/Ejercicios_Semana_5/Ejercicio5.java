package Ejercicios_Semana_5;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        int resultado;
        System.out.println("Voy a pedirte 10 números para hacer la media de los mismos");
        System.out.println("Dame el primer número");
        Scanner sc = new Scanner(System.in);
        resultado = sc.nextInt();
        for (int i = 0; i<9; i++){
            System.out.println("Dame el siguiente numero");
            resultado = resultado + sc.nextInt();

        }
        int res = resultado /10;
        System.out.println("La media es " + res);
    }
}
