package com.cvprado.ExamenPartePractica.Ejercicio_1y2;

public class Calculadora {

     protected int valor;
     protected String operador;

    public Calculadora(int valor, String operador) {
        this.valor = valor;
        this.operador = operador;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    double suma() {
        return 0;
    }

    double resta() {
        return 0;
    }

    double multiplica() {
        return 0;
    }

    double division() {
        return 0;
    }

    void Switch(String operador) {
    }



    //La clase Calculadora debe tener los métodos básicos para operar: suma, resta,
    //multiplicación y división. Estos métodos deben recibir como parámetros los valores que
    //se ingresaron por consola y retornar el resultado. Ejemplo:
    //suma(10, 30) -> retorna 40
    //No es necesario que Calculadora tenga atributos, pero si lo considera necesario puede
    //agregarlos.
}
