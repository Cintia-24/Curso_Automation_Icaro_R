package com.cvprado.clase_4.Practica_4;

public class Alumno extends Persona {

    private String matricula;
    private Integer nota;
     public Alumno(String matricula, Integer nota, String nombre, String apellido) {
         super(nombre, apellido);
         this.matricula = matricula;
         this.nota = nota;
     }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
}
