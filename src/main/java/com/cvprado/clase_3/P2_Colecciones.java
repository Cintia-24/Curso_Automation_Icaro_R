package com.cvprado.clase_3;

import java.util.ArrayList;
import java.util.List;

public class P2_Colecciones {

    public static void main(String[] args) {

        int[] arrayEnteros = new int[4];

        arrayEnteros[0] = 20;
        arrayEnteros[1] = 500;
        arrayEnteros[2] = 10000;
        arrayEnteros[3] = 3000000;

        System.out.println("Posicion 0: " + arrayEnteros[0]);

        int variable = arrayEnteros[1];

        System.out.println("La posicion 1 tiene " + variable);
        System.out.println("La posicion 2 tiene " + arrayEnteros[2]);
        System.out.println("La posicion 3 tiene " + arrayEnteros[3]);
        //System.out.println("La posicion 4 tiene " + arrayEnteros[4]); // tiene que dar error

        // LISTAS
        List<String> listadestrings = new ArrayList<>();

        listadestrings.add("Hola");
        listadestrings.add("Soy");
        listadestrings.add("Cintia");

        System.out.println("Posicion 0: " + listadestrings.get(0));
        System.out.println("Posicion 1: " + listadestrings.get(1));
        System.out.println("Posicion 2: " + listadestrings.get(2));


        System.out.println("Datos de la Lista: " + listadestrings);

        //System.out.println("Posicion 4: " + listadestrings.get(4));// debe dar error

        listadestrings.remove(1);
        System.out.println("Datos de la Lista: " + listadestrings);


    }
}
