package com.cvprado.ExamenPartePractica.Ejercicio_3;

public abstract class Personaje {
    //● Personaje: tiene el atributo salud (tipo entero) y un método abstracto entrenar()

     private int salud;

    public Personaje(int salud) {
        this.salud = salud;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public abstract void entrenar();
}
