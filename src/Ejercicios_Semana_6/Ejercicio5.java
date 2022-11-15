package Ejercicios_Semana_6;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
     Juego instanciaJuego = new Juego();
     Scanner sc = new Scanner (System.in);
        System.out.println("Bienvenido al juego de adivinar el número. Dime números, y te diré si estás cerca del número a adivinar o no, hasta que lo aciertes");
        int numeroUsuario = sc.nextInt();
        instanciaJuego.azar(numeroUsuario, sc);

    }
}
