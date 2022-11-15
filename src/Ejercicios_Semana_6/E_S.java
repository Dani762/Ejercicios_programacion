package Ejercicios_Semana_6;

import java.util.Scanner;

public class E_S {


    public static String cadenaUsuario(String mensaje, Scanner sc){
        mensaje = "Dame una cadena de caracteres";
        System.out.println(mensaje);
        String mensajeUsuario = sc.nextLine();
        return mensajeUsuario;
    }



    public static int ValorUsuario(String mensaje, Scanner sc){
        mensaje = "¿Qué valor quieres que muestre en pantalla?";
        System.out.println(mensaje);
        int nMostrado = sc.nextInt();
        return nMostrado;
    }





    public static String mostrarCadena(String mensaje){
        System.out.println(mensaje);
        return mensaje;
    }
}
