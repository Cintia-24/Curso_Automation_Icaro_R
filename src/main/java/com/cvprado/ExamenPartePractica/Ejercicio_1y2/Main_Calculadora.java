package com.cvprado.ExamenPartePractica.Ejercicio_1y2;

import java.util.Scanner;

public class Main_Calculadora extends Calculadora {



    public double main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        valor = teclado.nextInt();
        operador = teclado.next();

        System.out.println("Ingresar valor 1:");
        valor = teclado.nextInt();

        System.out.println("Ingresar valor 2:");
        valor = teclado.nextInt();

        System.out.println("Ingresar operacion:");
        operador = teclado.next();

        double resultado = 0;


        double suma = valor + valor; {
            return resultado;
        }

        double resta = valor - valor;{
            return resultado;
        }

        double multiplica = valor * valor; {
            return resultado;
        }

        double division = valor / valor; {
            return resultado;
        }


        operador = "+";
        Switch(operador); {
            case : operador = "+";
                System.out.println("El resultado es: " + resultado);
            break;
            case resta(): operador = "-";
                System.out.println("El resultado es: " + resultado);
            break;
            case multiplica(): operador = "*";
                System.out.println("El resultado es: " + resultado);
            break;
            case: operador = "/";
                System.out.println("El resultado es: " + resultado);
            break;
            default:
                System.out.println("La operacion no es valida");
        }

        if (resultado < 0){
            System.out.println("Ten cuidado,el resultado en Negativo!");
        } else if (resultado >=0 && resultado<10000) {
            System.out.println("Resultado dentro de los limites");
        }else {
            System.out.println("ERROR, resultado muy grande");
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

