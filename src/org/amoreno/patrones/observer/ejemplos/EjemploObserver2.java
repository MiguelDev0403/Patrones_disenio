package org.amoreno.patrones.observer.ejemplos;

import org.amoreno.patrones.observer.UsuarioRepositorio;

public class EjemploObserver2 {
    public static void main(String[] args) {
        UsuarioRepositorio repositorio= new UsuarioRepositorio();
        repositorio.addObserver((o,u) -> System.out.println("Enviando un email al Usuario " + u));
        repositorio.addObserver((o,u) -> System.out.println("Enviando un email al administrador"));
        repositorio.addObserver((o,u) -> System.out.println("Guardando info del usuario "
                + u + " en Logs "));
        repositorio.crearUsuario("Andres");

    }
}
