package org.amoreno.patrones.observer.ejemplos;

import org.amoreno.patrones.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google=new Corporacion("Google",1000);
        google.addObserver((observable,obj) ->{
            System.out.println("Jhon:"+ observable);
        });

        google.addObserver((observable,obj) ->{
            System.out.println("Maria:"+observable);
        });
        google.modificaPrecio(1500);
    }
}
