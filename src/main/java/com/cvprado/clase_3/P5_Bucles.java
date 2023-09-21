package com.cvprado.clase_3;

public class P5_Bucles {
    public static void main(String[] args) {

        //WHILE
        int contadorWhile = 0;

        while (contadorWhile < 5) {
            System.out.println("Hola Mundo");

            contadorWhile = contadorWhile + 1;
            //contadorWhile += 1;
            //contadorWhile ++;
        }

        System.out.println();

        //DO WHILE
        int contadorDoWhile = 0;

        do {
            System.out.println("Hola Mundo");
            contadorDoWhile += 1;
        } while (contadorDoWhile < 5);

        System.out.println();

        //FOR
        for(int i = 0; i < 5; i ++) {
            System.out.println(" Hola Mundo");
        }
    }
}
