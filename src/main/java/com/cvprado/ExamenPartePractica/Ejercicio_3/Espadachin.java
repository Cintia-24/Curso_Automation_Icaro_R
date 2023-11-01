package com.cvprado.ExamenPartePractica.Ejercicio_3;

public class Espadachin extends Personaje {

    private int ataque = 10;

    public Espadachin(int salud, int ataque) {
        super(salud);
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void entrenar() {
        ataque = ataque + 10;
        System.out.println("Incrementa en 10 el ataque");
    }
    // Espadachín: este personaje extiende de Personaje y además tiene el atributo
    //ataque (tipo entero). Cuando el espadachín entrena, incrementa su ataque en 10.


}
