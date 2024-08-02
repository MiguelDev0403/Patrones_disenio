package org.amoreno.patrones.composite;

public class Archivo extends Componente{


    public Archivo(String nombre) {
        super(nombre);
    }

    @Override
    public String mostrar() {
        return nombre;
    }
}