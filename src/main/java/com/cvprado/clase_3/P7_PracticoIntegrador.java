package com.cvprado.clase_3;

import com.cvprado.clase_4.Practica_4y5.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P7_PracticoIntegrador {
    public static void main(String[] args) {

        //Ingresar por consola un número mientras sea menor o igual a 500 y almacenar el número
        // en una lista. Al finalizar el ingreso mostrar los datos y la cantidad ingresada
        // por pantalla.
        //También, sí hubo menos de 10 ingresos mostrar “Se ingresaron pocos números” de los
        // contrario mostrar “Se excedió la cantidadde ingresos”

        Scanner scanner = new Scanner(System.in);
        Integer num;

        List<Integer> listaDeNumeros = new ArrayList<>();

        System.out.println("El ingreso finaliza con un numero mayor a 500");
        do {
            System.out.println("Ingresar un numero");
            num = scanner.nextInt();

            if (num <= 500) {
                listaDeNumeros.add(num);
            }

        }while(num<=500); {
            System.out.println("Cantidad ingresada: " + listaDeNumeros.size());
        }

        if (listaDeNumeros.size() < 10) {
            System.out.println("Se ingresaron pocos números");
        } else {
            System.out.println("Se excedio la cantidad de ingresos. Los numeros ingresados son: "+ listaDeNumeros);

        }







    }
}
