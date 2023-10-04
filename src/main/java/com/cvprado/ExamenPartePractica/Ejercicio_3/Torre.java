package com.cvprado.ExamenPartePractica.Ejercicio_3;

public class Torre extends Personaje {

    private int nivel;

    public Torre(int salud, int nivel) {
        super(salud);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    void entrenar() {
        System.out.println("Incrementa en 1 el nivel");
    }
    //Torre: extiende de Personaje y tiene el atributo nivel (tipo entero). Cuando entrena,
    //aumenta si nivel en 1
}
