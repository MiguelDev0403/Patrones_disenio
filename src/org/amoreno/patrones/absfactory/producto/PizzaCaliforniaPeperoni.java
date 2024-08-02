package org.amoreno.patrones.absfactory.producto;

import org.amoreno.patrones.absfactory.PizzaProducto;

public class PizzaCaliforniaPeperoni extends PizzaProducto {
    public PizzaCaliforniaPeperoni() {
        super();
        nombre= "Pizza Peperoni California";
        masa="Masa gruesa a la piedera ";
        salsa="Salsa de tomate";
        ingredientes.add("queso mozarella ");
        ingredientes.add("extra peperoni");
        ingredientes.add("aceitunas ");
    }

    @Override
    public void cocinar() {
        System.out.println("cocinando a 95 grados por 50 mins ");
    }

    @Override
    public void cortar() {
        System.out.println("cortando la pizza ....  ");

    }
}
