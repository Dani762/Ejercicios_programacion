package Ejercicios_Semana_4;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Escoge una de estas figuras geométricas para calcular el área: \nTriángulo \nRectángulo \nPentágono \nHexágono");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        switch (a) {
            case "Triángulo" -> {
                System.out.println("Dame la base del triángulo");
                double base = sc.nextInt();
                System.out.println("Dame la altura del triángulo");
                double altura = sc.nextInt();
                System.out.println("El área del triángulo es " + base * altura / 2);
            }
            case "Rectángulo" -> {
                System.out.println("Dame el ancho del rectángulo");
                double ancho = sc.nextInt();
                System.out.println("Dame el largo del rectángulo");
                double largo = sc.nextInt();
                System.out.println("El área del rectángulo es " + largo * ancho);
            }
            case "Pentágono" -> {
                System.out.println("Dame el perímetro del pentágono");
                double perimetro = sc.nextInt();
                System.out.println("Dame el apotema del pentágono");
                double apotema = sc.nextInt();
                System.out.println("El área del pentágono es " + perimetro * apotema / 2);
            }
            case "Hexágono" -> {
                System.out.println("Dame el perímetro del hexágono");
                double peri = sc.nextInt();
                System.out.println("Dame el apotema del hexágono");
                double apo = sc.nextInt();
                System.out.println("El área del hexágono es " + peri * apo / 2);
            }
        }

    }
}
