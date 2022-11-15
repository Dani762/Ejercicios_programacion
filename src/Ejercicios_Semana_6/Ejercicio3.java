package Ejercicios_Semana_6;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        int [] aleatorio = new int[6];
        aleatorio = arrayRandom(aleatorio);
        for (int i=0, f = 0;i<6;i++, f++){
            System.out.println("Número "+ aleatorio[i] +" en la posición "+f);
        }

    }
    public static int[] arrayRandom(int[] aleatorio){
        aleatorio[0] = (int) (Math.random() * 100);
        aleatorio[1] = (int) (Math.random() * 100);
        aleatorio[2] = (int) (Math.random() * 100);
        aleatorio[3] = (int) (Math.random() * 100);
        aleatorio[4] = (int) (Math.random() * 100);
        aleatorio[5] = (int) (Math.random() * 100);
        return aleatorio;

    }
}
