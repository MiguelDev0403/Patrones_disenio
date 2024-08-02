package org.amoreno.patrones.absfactory.ejemplo;

import org.amoreno.patrones.absfactory.PizzaProducto;
import org.amoreno.patrones.absfactory.PizzeriaCaliforniaFactory;
import org.amoreno.patrones.absfactory.PizzeriaNewYorkFactory;
import org.amoreno.patrones.absfactory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny =new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california =new PizzeriaCaliforniaFactory();
        PizzaProducto pizza = california.ordenarPizza("California Queso");
        System.out.println("Miguel ordeno " + pizza.getNombre());

        pizza= ny.ordenarPizza("Vegetariana");
        System.out.println("Angelica ordeno "+pizza.getNombre());

        pizza= california.ordenarPizza("California Vegetariana");
        System.out.println("Bruno ordeno "+pizza.getNombre());


        System.out.println("\n");
        pizza= ny.ordenarPizza("Italiana");
        System.out.println("Victor ordeno "+pizza.getNombre());



        pizza= ny.ordenarPizza("Peperoni");
        System.out.println("Adan ordeno "+pizza.getNombre());



        System.out.println("pizza = " + pizza);

    }
}
