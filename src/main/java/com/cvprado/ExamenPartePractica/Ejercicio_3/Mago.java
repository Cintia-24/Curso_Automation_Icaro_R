package com.cvprado.ExamenPartePractica.Ejercicio_3;

public class Mago extends Personaje {

    private String magia;

    public Mago(int salud, String magia) {
        super(salud);
        this.magia = magia;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public void entrenar() {
        System.out.println("No sucede nada");

    }


    //Mago: extiende de Personaje y tiene el atributo magia (tipo String). Los magos son
    //vagos, no les gusta entrenar. Por lo tanto cuando entrenan, no sucede nada.
}
