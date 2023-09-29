package com.cvprado.clase_4.Herencia;

public class Vehiculo {

        protected String marca;
        protected String modelo;
        protected Integer anio;

    public Vehiculo(String marca, String modelo, Integer anio){
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
        }

        public String getMarca () {
            return marca;
        }

        public String getModelo () {
            return modelo;
        }

        public int getAnio () {
            return anio;
        }

        public void acelerar () {
            System.out.println("Se debe acelerar");
        }

        public void frenar () {
            System.out.println("Se debe frenar");
        }
    }
