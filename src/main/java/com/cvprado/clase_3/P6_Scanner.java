package com.cvprado.clase_3;

import java.util.Scanner;

public class P6_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar un entero");
        int entero = scanner.nextInt();

        System.out.println("Ingresar una cadena");
        String cadena = scanner.next();

        System.out.println(" Ingresar un decimal");
        double decimal = scanner.nextDouble();

        System.out.println(" Ingresar un booleano");
        boolean booleano = scanner.nextBoolean();


    }
}
