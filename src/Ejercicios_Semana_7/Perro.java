package Ejercicios_Semana_7;

public class Perro {
    //Ejercicio 1: declarar variables en la clase perro.
    private String Pelo = "", Color = "";
    private int chip = 0;
    private int Peso = 0, Altura = 0;
    private String Raza = "";
//Ejercicio 5: tras crear peso y altura, creo también sus métodos para usarlos en otras funciones.


    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public String getPelo() {
        return Pelo;
    }

    public void setPelo(String pelo) {
        this.Pelo = pelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = Color;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    //Ejercicio 6: A continuación, el método ladrar permitirá identificar el ladrido de, por ejemplo, un Labrador como de perro grande (grave) y otro de Chihuahua como agudo de perro pequeño.
    public String ladrar(int Altura, int Peso) {
        String ladridoGrande = " tiene un ladrido de perro grande";
        String ladridoPequeño = " tiene un ladrido de perro pequeño";
        if (Peso > 20 && Altura > 60) {
            return ladridoGrande;
        } else {
            return ladridoPequeño;
        }
    }
        public String getRaza () {
            return Raza;
        }
        public void setRaza(String Raza){
        this.Raza = Raza;
        }

    }
