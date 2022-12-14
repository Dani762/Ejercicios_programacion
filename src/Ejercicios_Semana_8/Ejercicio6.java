package Ejercicios_Semana_8;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coche Coche1 = new Coche();
        boolean salir = false;
        Garaje garaje1 = new Garaje();
        String tipo = "";
        String marca = "";
        boolean salirTipo = false;

        while(!salir){
            System.out.println("Bienvenido a tu garaje.¿De cuántas plazas quieres que sea el garaje?");
            int plazasUsuario = sc.nextInt();
            System.out.println("Escoge una opción: \n 1. Automáticamente\n 2. Manualmente\n 3. Salir");
            int eleccion = sc.nextInt();
            garaje1.plazas(plazasUsuario);
            switch (eleccion){
                case 1:
                    for (int i = 0; i< garaje1.plazas.length; i++) {
                        Coche1 = new Coche();
                        garaje1.plazas[i]=Coche1;
                        if (Coche1.getTipo()=="camión"){
                            i++;
                        }else{

                        }
                    }
                    System.out.println(Arrays.toString(garaje1.plazas));

                    System.out.println("¿Deseas eliminar algún coche?\n 1. Sí\n 2. No");
                    int decision = sc.nextInt();
                    if (decision == 1){
                        System.out.println("Dime la posición que deseas borrar");
                        int PosicionBorrada = sc.nextInt();
                        garaje1.BorrarPosicion(PosicionBorrada);
                        System.out.println(Arrays.toString(garaje1.plazas));
                    }else{
                        salir = true;
                    }
                    break;


                case 2:
                    int HuecosLibres = garaje1.plazas.length;
                    for (int i = 0; i< garaje1.plazas.length; i++, HuecosLibres--) {
                        salirTipo = false;
                        boolean HuecosLlenos = false;
                        System.out.println("¿De qué marca es el vehículo?");
                        marca = sc.next();
                        tipo = "";
                        while (!salirTipo) {
                            System.out.println("¿Es un coche o un camión? 1.- coche 2.- camión");
                            int elegirTipo = sc.nextInt();

                            while (!HuecosLlenos) {

                                if ((HuecosLibres < 2) && (elegirTipo == 2)) {
                                    System.out.println("Por favor, introduce un coche. El camión ocupa dos espacios y no hay suficientes.");
                                    elegirTipo = sc.nextInt();
                                } else {


                            switch (elegirTipo) {
                                case 1:
                                    tipo = "coche";
                                    salirTipo = true;
                                    HuecosLlenos = true;
                                    break;
                                case 2:
                                    tipo = "camión";
                                    salirTipo = true;
                                    HuecosLlenos = true;
                                    break;
                                default:
                                    System.out.println("Por favor, introduce una elección válida");
                            }
                            }
                            }
                        }
                        Coche1 = new Coche(marca, tipo);
                        garaje1.plazas[i] = Coche1;
                        if (tipo == "coche"){

                        }else{
                            i++;
                            }
                        if (i>garaje1.plazas.length){
                            System.out.println("Límite superado, por favor, introduce un coche");
                        }
                    }
                    System.out.println(Arrays.toString(garaje1.plazas));

                    System.out.println("¿Deseas eliminar algún coche?\n 1. Sí\n 2. No");
                    decision = sc.nextInt();
                    if (decision == 1) {
                        System.out.println("Dime la posición que deseas borrar");
                        int PosicionBorrada = sc.nextInt();
                        garaje1.BorrarPosicion(PosicionBorrada);
                        System.out.println(Arrays.toString(garaje1.plazas));
                    }else{
                        salir = true;
                    }
                        break;
                    case 3:
                        salir = true;
                     break;

            }
        }
    }


}
