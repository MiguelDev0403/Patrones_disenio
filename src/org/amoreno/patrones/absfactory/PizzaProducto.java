package org.amoreno.patrones.absfactory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {
    protected  String nombre;
    protected String masa;
    protected String salsa;
    protected List<String>ingredientes;

    public String getNombre() {
        return nombre;
    }

    public PizzaProducto(){
        this.ingredientes=new ArrayList<>();

    }
    public void preparar(){
        System.out.println("Preparando ... " + nombre);
        System.out.println(" Seleccionando la masa ... " + masa);
        System.out.println(" Agregando la salsa ... " + salsa);
        System.out.println(" Agregando los ingredientes ... " + ingredientes);
       ingredientes.forEach(i-> System.out.println("Ingredientes = " + ingredientes));
    }
    abstract public void  cocinar ();

    abstract public void cortar();



    public void empaquetar(){
        System.out.println("Empaquetando ..." + nombre );
    }

    @Override
    public String toString() {
        return "PizzaProducto{" +
                " Nombre = " + nombre +
                " Masa = " + masa +
                " Salsa = " + salsa +
                " Ingredientes = " + ingredientes ;
    }
}
