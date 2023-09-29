package com.cvprado.clase_4.Herencia;

import com.cvprado.clase_4.Practica_4y5.Alumno;
import com.cvprado.clase_4.Practica_4y5.Persona;
import com.cvprado.clase_4.Practica_4y5.Profesor;

public class MainHerencia {

    //3. En el método main, crea una instancia de la clase Vehiculo con
    //los valores "Toyota", "Corolla" y 2020. Luego, crea una instancia
    //de la clase Coche con los valores "Ford", "Mustang", 2021 y
    //5000.
    //
    //4. Imprime los detalles del vehículo y del coche utilizando los
    //métodos get, y luego llama al método acelerar() correspondiente
    //para cada objeto    }

    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo ("Toyota","Corolla",2020);
        Coche coche = new Coche("Ford","Mustang",2021,5000);

        System.out.println("La marca del vehiculo es: " +vehiculo.getMarca());
        System.out.println("El modelo del vehiculo es: " +vehiculo.getModelo());
        System.out.println("El anio del vehiculo es: " +vehiculo.getAnio());

        System.out.println("La marca del coche es: " + coche.getMarca());
        System.out.println("El modelo del coche es: " +coche.getModelo());
        System.out.println("El anio del coche es: " +coche.getAnio());
        System.out.println("La cilindrada del coche es: " +coche.getCilindrada());

        vehiculo.acelerar();
        coche.acelerar();

    }
}
