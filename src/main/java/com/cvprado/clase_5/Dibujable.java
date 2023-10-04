package com.cvprado.clase_5;

public interface Dibujable {
    void dibujar();

    default void borrar(){
        System.out.println("Borrando Figura");
    }
}
