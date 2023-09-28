package com.cvprado.clase_4.Practica_4y5;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {

    private List<Alumno> alumnos;

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
        this.alumnos = new ArrayList<>();
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno alumno) {

        this.alumnos.add(alumno);
    }

    @Override
    public void saludar() {
        System.out.println("Hola a todos");
    }

 //   En Profesor se debe implementar un método calificar() sobrecargado
 //   Si calificar recibe un Alumno y la nota, agrega a ese alumno la nota
 //   Si calificar solo recibe una nota, agrega a todos sus alumnos la misma nota

    public void calificar(Alumno alumno, Integer nota) {
        alumno.setNota(nota);
    }

    public void calificar (Integer nota) {
        for (int i = 0; i < alumnos.size(); i++) {
            alumnos.get(i).setNota(nota);
        }
    }

        //otra opcion mas facil es la siguiente
        //itera por la lista

        //for (Alumno alumno : alumnos) {
            //alumno.setNota(nota);

        //otra forma mas clara, mas declarativa, recibe funcion lambda
        // es la que debemos aprender

        //alumnos.forEach(alumno -> alumno.setNota(nota));
}

