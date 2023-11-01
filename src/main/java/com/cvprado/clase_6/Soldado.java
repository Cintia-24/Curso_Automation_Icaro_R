package com.cvprado.clase_6;

public class Soldado {

    private int salud;

    public Soldado(int salud) {
        this.salud = salud;
    }
    public Soldado() {
        this.salud = 100;
    }//esto es si no le paso parametros cada soldado
    // tendra 100 de salud o el numero que le ponga


    public int getSalud() {
        return this.salud;
    }//este es el  geter para el test

    public void pelear(int ataque){
        this.salud = this.salud - (ataque/2);
    }
    public void descansar(){
        this.salud = this.salud +10;
        // this.salud +=10; es otra foram de escribirlo mas corto.
    }
    public boolean estaMuerto(){
        return this.salud <= 0;
    }
}
//Crear la clase Soldado con las siguientes características: tiene el atributo salud y los
//métodos pelear, descansar y estaMuerto. Cuando un Soldado pelea pierde de salud la
//mitad del ataque que recibe. Y cuando descansa recupera 10 de salud. El soldado está
//muerto si la salud es menor o igual a 0
//Implementar tests sobre la clase Soldado.
