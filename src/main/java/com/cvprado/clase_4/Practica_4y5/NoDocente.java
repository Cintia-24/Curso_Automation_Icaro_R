package com.cvprado.clase_4.Practica_4y5;

public class NoDocente extends Persona {



    public NoDocente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void saludar() {
        System.out.println("Buen dia");
    }
}
