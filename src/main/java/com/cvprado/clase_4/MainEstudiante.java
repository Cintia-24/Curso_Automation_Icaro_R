package com.cvprado.clase_4;

public class MainEstudiante {
    public static void main(String[] args) {
        P1Estudiante Jose = new P1Estudiante(100,"Jose","Josesito", 5.4f);

        System.out.println( "Id =" + Jose.getId());
        System.out.println( "Nombre =" + Jose.getNombre());
        System.out.println( "Apellido =" + Jose.getApellido());
        System.out.println( "Promedio =" + Jose.getPromedio());

        Jose.setPromedio(7.0f);

        System.out.println( "Promedio =" + Jose.getPromedio());
    }
}
