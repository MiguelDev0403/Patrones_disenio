package org.amoreno.patrones.singleton;

public class ConexionBdSingleton {
    private static ConexionBdSingleton instancia;
    private ConexionBdSingleton(){
        System.out.println("Conectando a la base de datos ....");
    }
     public static ConexionBdSingleton getInstance(){
        if (instancia==null){
            instancia=new ConexionBdSingleton();
        }
        return ConexionBdSingleton.instancia;
     }

}
