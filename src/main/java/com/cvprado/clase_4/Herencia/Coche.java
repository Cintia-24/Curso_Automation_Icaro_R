package com.cvprado.clase_4.Herencia;

public class Coche extends Vehiculo{

    private Integer cilindrada;

    public Coche(String marca, String modelo, Integer anio, Integer cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    //Un método acelerar() que imprima un mensaje indicando que el
    //coche está acelerando. Este método debe sobrescribir al método
    //acelerar() de la clase Vehiculo.

    @Override

    public void acelerar() {
        System.out.println("El coche esta acelerando");
    }
}
