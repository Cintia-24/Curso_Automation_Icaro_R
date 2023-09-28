package com.cvprado.clase_4.Practica_4;

public class MainPersonas {
    public static void main(String[] args) {
        Persona persona = new Persona("Cintia","Prado");
        Alumno alumno = new Alumno("E123", 8,"Arturo", "Virgolini");
        Profesor profesor = new Profesor("Emma", "Virgolini");

        persona.getApellido();

        alumno.getNombre();

        profesor.getAlumnos();

    }
}
