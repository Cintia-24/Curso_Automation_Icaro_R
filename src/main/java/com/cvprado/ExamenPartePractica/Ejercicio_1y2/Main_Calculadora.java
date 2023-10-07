package com.cvprado.ExamenPartePractica.Ejercicio_1y2;

import com.cvprado.clase_4.Practica_4y5.Persona;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Main_Calculadora{

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(0,0);

        for (int i = 0; i < 5; i++) {

            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresar valor 1:");
            int valor1 = teclado.nextInt();

            System.out.println("Ingresar valor 2:");
            int valor2 = teclado.nextInt();

            System.out.println("Ingresar operacion:");
            String operador = teclado.next();


            double resultado = 0;

            switch (operador) {
                case "+":
                    resultado = calculadora.suma(valor1, valor2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case "-":
                    resultado = calculadora.resta(valor1, valor2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case "*":
                    resultado = calculadora.multiplica(valor1, valor2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case "/":
                    resultado = calculadora.divide(valor1, valor2);

                    if (valor2 != 0) {
                        System.out.println(" El resultado es: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                default:
                    System.out.println("La operacion no es válida.");


            }

            if (resultado < 0) {
                System.out.println("Tené cuidado, el resultado es negativo!");
            } else if (resultado >= 0 && resultado < 10000) {
                System.out.println("Resultado dentro de los límites");
            } else {
                System.out.println("Error, resultado muy grande");
            }
        }
    }
}




    //Requerimientos:
    //Se necesita realizar un programa que pida por consola dos valores enteros, la operación
    //matemática a realizar y muestre por pantalla el resultado. Por ejemplo:
    //–> Primer valor: 10
    //–> Segundo valor: 30
    //–> Operación: +
    //–> Resultado: 40
    //Nota: para obtener el resultado es necesario usar la clase Calculadora
    //Si la operación ingresada no es válida (es decir no es +, -, *, /) se debe mostrar: “Operación
    //no válida”
    //Una vez obtenido el resultado, se debe evaluar lo siguiente:
    //- Si el resultado de la operación es un número negativo, mostrar por pantalla el
    //mensaje “Tené cuidado, el resultado es negativo!”.
    //- De lo contrario si el resultado es mayor o igual a 0 y menor a 10000 , mostrar por
    //pantalla “Resultado dentro de los límites”.
    //- Y si no mostrar “Error, resultado muy grande”
    //No importa si la operación es válida o no, el programa finaliza después de ejecutarse 5
    //veces

