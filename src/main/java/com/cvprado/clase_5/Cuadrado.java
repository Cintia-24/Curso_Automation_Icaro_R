package com.cvprado.clase_5;

public class Cuadrado extends Figura implements Dibujable {

    protected double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }
}
