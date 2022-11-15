package Ejercicios_Semana_6;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Bienvenido, por favor, introduce los valores que llevará el array para mostrarlos por pantalla");
    Scanner sc = new Scanner(System.in);
    int[] DatosGuardados = array(sc);
    String.valueOf(bucle(DatosGuardados, sc));
    }

    public static int[] array(Scanner sc){
        int [] numeros = new int [5];
        System.out.println("Dame cinco números");
        numeros[0] = sc.nextInt();
        numeros[1] = sc.nextInt();
        numeros[2] = sc.nextInt();
        numeros[3] = sc.nextInt();
        numeros[4] = sc.nextInt();
        return numeros;
    }
    public static boolean bucle(int[] DatosGuardados, Scanner sc) {
        boolean salir = false;
        int eleccion = 0;
        while (!salir) {
            for (int i = 0, f = 0; i<5;i++, f++) {
                System.out.println("Número "+DatosGuardados[f] + " en la posición "+i);

            }
            System.out.println("¿Quieres continuar?\n 1 - Sí\n 2 - No");
        eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    DatosGuardados = array(sc);
                    break;
                case 2:
                    salir = true;
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Elección incorrecta, por favor, introduce una opción");
            }
        }
        return salir;
    }
}
