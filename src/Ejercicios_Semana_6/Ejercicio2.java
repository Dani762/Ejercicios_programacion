package Ejercicios_Semana_6;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Azar instanciaAzar = new Azar();
        int resultado = instanciaAzar.aleatorio(sc);
        System.out.println(resultado);
    }
}
