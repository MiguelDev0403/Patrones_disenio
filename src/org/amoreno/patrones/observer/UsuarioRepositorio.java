package org.amoreno.patrones.observer;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio extends Observable{
    private List<String> repositorio = new ArrayList<String>();
    public void crearUsuario(String Usuario){
        repositorio.add(Usuario);
        notifyObservers(Usuario);
    }
}
