package Ejercicios_Semana_6;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String mensaje = "";
        Scanner sc = new Scanner(System.in);
        E_S instanciaE_S = new E_S();
        System.out.println("Escoge una de las tres opciones:\n1 - Dame una cadena de caracteres dentro del método y te mostraré la cadena\n 2 - Dame una cadena de caracteres y te mostraré un entero\n 3 - Dame una cadena de caracteres fuera del método, la meteré y te mostraré dicha cadena");
        int eleccion = sc.nextInt();
        sc.nextLine();
            switch (eleccion) {
                case 1:
                    String cadena = instanciaE_S.cadenaUsuario(mensaje,sc);
                    System.out.println(cadena);
                    break;
                case 2:
                    int numero = instanciaE_S.ValorUsuario(mensaje,sc);
                    System.out.println(numero);
                    break;
                case 3:
                    mensaje = "Esta cadena viene predeterminada";
                    instanciaE_S.mostrarCadena(mensaje);
                    break;

            }
    }





}
