package Ejercicios_Semana_6;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("En este juego debes adivinar un número entre 0 y 100 en 5 intentos. Si no lo consigues, habrás perdido la partida");
        System.out.println("Para empezar, dame un número entre 0 y 100");
        int NumUsuario = sc.nextInt();
        boolean resultado = juego(NumUsuario, sc);
        //Creo el boolean y guardo el número que me da el usuario
    }

    public static boolean juego(int NumUsuario, Scanner sc) {
        int aleatorio = (int) (Math.random() * (100 - 1)) + 1;
        //Declaro aleatorio, ahora debo hacer el bucle for con un contador que vaya sumando cada vez que el usuario falle
        for (int i = 1; NumUsuario > aleatorio || NumUsuario < aleatorio; i++) {
            if (NumUsuario > aleatorio) {
                System.out.println(esMayor(NumUsuario,aleatorio));
                NumUsuario = sc.nextInt();
            }
            if (NumUsuario < aleatorio) {
                System.out.println(esMenor(NumUsuario,aleatorio));
                NumUsuario = sc.nextInt();
            }
            if (i == 4) {
                System.out.println(HasPerdido(NumUsuario,aleatorio));
                break;
            }
            if (NumUsuario == aleatorio) {
                System.out.println(esIgual(NumUsuario,aleatorio));
                break;
            }
        }
        return false;
    }

    public static String esMenor(int NumUsuario, int aleatorio) {
        String mensaje = "El número que me das es menor que el que tienes que adivinar";
        return mensaje;
    }

    public static String esMayor(int NumUsuario, int aleatorio) {
        String mensaje = "El número que me das es mayor que el que tienes que adivinar";
        return mensaje;
    }

    public static String esIgual(int NumUsuario, int aleatorio) {
        String mensaje = "Has acertado el número y por tanto has ganado";
        return mensaje;
    }
    public static String HasPerdido(int NumUsuario, int aleatorio){
        String mensaje = "Has llegado a cinco intentos, has perdido";
        return mensaje;
    }
}
