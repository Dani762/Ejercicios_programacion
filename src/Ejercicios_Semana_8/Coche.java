package Ejercicios_Semana_8;
import java.util.Random;

public class Coche {

    private String tipo = "";
    private String marca = "";
    private String Matricula = "";

     Coche() {
        int tamano = (int) (Math.random() * (100-1+1) + 1);
        String tipo = "";
        if (tamano >= 50){
            tipo = "camión";
        }
        else{
            tipo = "coche";
        }
        this.tipo = tipo;
        String matricula = generarMatricula();
        this.Matricula = matricula;
        String[] marca = new String[]{"Audi","Mercedes-Benz","Ford","Renault","Mitsubishi"};
        Random aleatorio = new Random();
        int n = aleatorio.nextInt(5);
        this.marca = String.valueOf(marca[n]);
    }
    public Coche(String marca, String tipo){
        this.marca = marca;
        this.tipo = tipo;
        String matricula = generarMatricula();
        this.Matricula = matricula;
        String completo = tipo+", marca "+marca+", matrícula "+matricula;
    }

    public String generarMatricula() {
        int NumMatricula = (int) (Math.floor(Math.random() * (9999-1000+1) + 1000));
        String [] LetraMatricula = new String [3];
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            String CaracteresDeseados = "BCDFGHJKLMNPQRSTVWXYZ";
            int randomInt = random.nextInt(CaracteresDeseados.length());
            char RandomChar = CaracteresDeseados.charAt(randomInt);
            LetraMatricula [i]= String.valueOf(RandomChar);
        }
        String Matricula = "";

            Matricula = String.valueOf(NumMatricula+"-"+LetraMatricula[0]+LetraMatricula[1]+LetraMatricula[2]);

        return Matricula;

    }

    public String getTipo(){
        String tipo = "";
         tipo = this.tipo;
         if(tipo == "Camión"){
             return tipo;
         }else{
             return tipo;
         }
    }

    @Override
    public String toString() {
        String out = "";
        out = marca+", "+tipo+", con matrícula "+Matricula+"\n";
        return out;
    }
    public String CocheManual(String marca, String tipo){
        marca = this.marca;
         tipo = this.tipo;
         String matricula = generarMatricula();
        String completo = tipo+", marca "+marca+", matrícula "+matricula;
        return completo;
    }

}




