package org.amoreno.patrones.singleton;
//Patron de disenio de tipo creacional que restringe la invocacion de una estancia a una sola vez
public class EjemploSingleton {
    public static void main(String[] args) {
for (int i =0; i<10;i++){
    ConexionBdSingleton con = ConexionBdSingleton.getInstance();
    System.out.println("conexion : " + con);
}
    }
}
