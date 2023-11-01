package com.cvprado.clase_5;

public class P3Durmiente {
    public void dormir() {

        try {
            Thread.sleep(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Fallo sleep");
            e.printStackTrace();
        } catch (InterruptedException ignore) {
        }
    }
}