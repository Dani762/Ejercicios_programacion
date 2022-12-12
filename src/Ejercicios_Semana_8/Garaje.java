package Ejercicios_Semana_8;
import java.util.Scanner;
public class Garaje {
    public Coche[] plazas;
    private Scanner sc = new Scanner(System.in);

public void plazas(int numeroPlazas) {
    Coche[] plazas = new Coche[numeroPlazas];
    this.plazas = plazas;
    }
public void BorrarPosicion (int BorrarPosicion){
    plazas[BorrarPosicion] = null;
    plazas = this.plazas;

}
}
