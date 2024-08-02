package org.amoreno.patrones.absfactory.producto;

import org.amoreno.patrones.absfactory.PizzaProducto;

public class PizzaNewYorkPeperoni extends PizzaProducto {
    public PizzaNewYorkPeperoni() {
        super();
        nombre= "Pizza Peperoni New York";
        masa="Masa delgada a la piedera ";
        salsa="Salsa de tomate";
        ingredientes.add("queso mozarella ");
        ingredientes.add("extra peperoni");
        ingredientes.add("aceitunas ");


    }

    @Override
    public void cocinar() {
        System.out.println(" Cocinando pizza por 40 mins a 150 grados ");
    }

    @Override
    public void cortar() {
        System.out.println("cortando la pizza en ocho rebanadas rectangulares ");

    }
}
