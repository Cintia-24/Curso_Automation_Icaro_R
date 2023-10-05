package com.cvprado.ExamenPartePractica.Ejercicio_1y2;

public class Calculadora {

     int valor1;
     int valor2;

    public Calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int suma(int valor1,int valor2) {
        return valor1 + valor2;
    }

    public double resta(int valor1,int valor2) {
        return valor1 - valor2;
    }

    public double multiplica(int valor1,int valor2){
        return valor1 * valor2;
    }

    public double divide(int valor1,int valor2){
        return valor1 /valor2;
    }
}


