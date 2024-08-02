package org.amoreno.patrones.composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente{
   private List<Componente> hijos;

    public Directorio(String nombre) {
        super(nombre);
        this.hijos=new ArrayList<>();
    }

    public Directorio addComponente(Componente c){
        hijos.add(c);
        return this;
    }
 public Directorio removerComponente(Componente c){
        hijos.remove(c);
        return this;
 }


    @Override
    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append("/").append("\n");
        for(Componente hijo : hijos){
            sb.append(hijo.mostrar()).append("\n");
        }
        return sb.toString();
    }
}
