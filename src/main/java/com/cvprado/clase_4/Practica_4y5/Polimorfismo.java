package com.cvprado.clase_4.Practica_4y5;

import java.util.ArrayList;
import java.util.List;

public class Polimorfismo {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("ABC", 8, "Pepito", "Pepe");

        Profesor profesor = new Profesor("Juan", "Carlos");

        NoDocente noDocente = new NoDocente("Clara", "Lopez");

        List<Persona> listaDePersonas = new ArrayList<>();

        listaDePersonas.add(alumno);
        listaDePersonas.add(profesor);
        listaDePersonas.add(noDocente);

        for (Persona persona : listaDePersonas) {
            persona.saludar();
        }
    }
}

