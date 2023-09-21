package com.cvprado.clase_3;

public class P4_Condicionales {
    public static void main(String[] args) {

        int var1 = 100;
        int var2 = 200;

        if (var1 < var2) {
            System.out.println("Var1 es menor que var2");
        }

        char var3 = 'C';
        char var4 = 'N';

        if (var3 == var4) {
            System.out.println("Son Iguales");
        } else {
            System.out.println("Son Distintos");
        }

        long var5 = 1000;

        if (var5 < 10) {
            System.out.println("Numero Chico");
        } else if (var5 > 50 && var5 < 200) {
            System.out.println("Numero Mediano");
        } else if (var5 > 500 && var5 < 1000) {
            System.out.println("Numero Grande");
        } else {
            System.out.println("Numero Muyyyy Grande");
        }

        String dia = "Domingo";

        switch (dia) {
            case "Lunes":
                System.out.println(" Es Lunes");
                break;
            case "Martes":
                System.out.println("Es Martes");
                break;
            case "Miercoles":
                System.out.println("Es Miercoles");
                break;
            case "Jueves":
                System.out.println("Es Jueves");
                break;
            case "Viernes":
                System.out.println("Es Viernes");
                break;
            default:
                System.out.println("Es Fin de Semana");
        }
    }


}
