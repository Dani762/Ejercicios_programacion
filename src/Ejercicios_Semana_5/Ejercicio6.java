package Ejercicios_Semana_5;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Locale;
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Bienvenido a tu calculadora personal y sencilla, por favor, indica una operación de las siguientes");
        System.out.println("Las operaciones son:\n" + "Suma\n" + "Resta" +"\nMultiplicación" + "\nDivisión");
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String operacion = sc.nextLine();
        switch (operacion) {
            case ("Suma"):
                System.out.println("Dame el primer número");
                double n1s = sc.nextDouble();
                System.out.println("Dame el segundo número");
                double n2s = sc.nextDouble();
                double resultadoS = n1s+n2s;
                System.out.println("El resultado es "+resultadoS);
                break;
            case ("Multiplicación"):
                System.out.println("Dame el primer número");
                double n1m = sc.nextDouble();
                System.out.println("Dame el segundo número");
                double n2m = sc.nextDouble();
                double resultadoM = n1m*n2m;
                System.out.println("El resultado es "+resultadoM);
                break;
            case ("Resta"):
                System.out.println("Dame el primer número");
                double n1r = sc.nextDouble();
                System.out.println("Dame el segundo número");
                double n2r = sc.nextDouble();
                double resultadoR = n1r-n2r;
                System.out.println("El resultado es "+resultadoR);
                break;
            case ("División"):
                System.out.println("Dame el primer número");
                double n1 = sc.nextDouble();
                System.out.println("Dame el segundo número");
                double n2 = sc.nextDouble();
                double resultadoD = n1/n2;
                System.out.println("El resultado es "+resultadoD);
                break;

        }
    }
}
