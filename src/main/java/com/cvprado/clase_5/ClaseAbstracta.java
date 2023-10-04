package com.cvprado.clase_5;

import java.util.ArrayList;
import java.util.List;

public class ClaseAbstracta {
    public static void main(String[] args) {


        Cuadrado cuadrado = new Cuadrado(4.7);
        Triangulo triangulo = new Triangulo(3.2, 2.6);
        //Figura figura = new Figura() No se uede instanciar una clase abstracta
        Rectangulo rectangulo = new Rectangulo(10, 3.65);

        //new Dibujable; no es posible instanciar una interfase


        List<Dibujable> listDibujable = new ArrayList<>();

        listDibujable.add(cuadrado);
        listDibujable.add(rectangulo);
        listDibujable.add(triangulo);


    }




}
