package Ejercicios_Semana_7;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        //Ejercicio 2: declarar objeto tipo perro y asignarle variables.
        Perro Chihuahua = new Perro();
        Perro Labrador = new Perro();
        Perro Golden = new Perro();
        //Ejercicio 7: Tres objetos tipo Perro creadas.
        //Ejercicio 4: he añadido a Perro un método get y un método set, de manera que desde el main puedo elegir qué valores tendrán.
        Chihuahua.setChip(1); //Ejercicio 3: al cambiar el método getChipa privado, el IDE avisa de que este método es ahora privado, por lo que no se puede acceder desde el main y solo desde Perro.
        Chihuahua.setPelo("largo");
        Chihuahua.setColor("rojo");
        Chihuahua.setAltura(20);
        Chihuahua.setPeso(10);


        Labrador.setChip(2);
        Labrador.setPelo("corto");
        Labrador.setColor("marrón");
        Labrador.setAltura(65);
        Labrador.setPeso(26);


        Golden.setChip(3);
        Golden.setPelo("largo");
        Golden.setColor("anaranjado");
        Golden.setAltura(70);
        Golden.setPeso(30);

        Perro [] arrayPerros = new Perro[3];
        arrayPerros[0] = Chihuahua;
        arrayPerros[1] = Labrador;
        arrayPerros[2] = Golden;
        for(int i=0;i<3;i++){
            switch(i){
                case 0:
                    Chihuahua.setRaza("Chihuahua");
                    System.out.println("El "+Chihuahua.getRaza()+ Chihuahua.ladrar(Chihuahua.getAltura(), Chihuahua.getPeso()));
                    break;
                case 1:
                    Labrador.setRaza("Labrador");
                    System.out.println("El "+Labrador.getRaza()+ Labrador.ladrar(Labrador.getAltura(), Labrador.getPeso()));
                    break;
                case 2:
                    Golden.setRaza("Golden");
                    System.out.println("El "+Golden.getRaza()+ Golden.ladrar(Golden.getAltura(), Golden.getPeso()));
                    break;
            }
        }


    }
}
