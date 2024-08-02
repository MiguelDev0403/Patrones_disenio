package org.amoreno.patrones.absfactory.producto;

import org.amoreno.patrones.absfactory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {
    public PizzaCaliforniaQueso() {
        super();
        nombre= "Pizza California Quso";
        masa="Masa delgada a la piedera ";
        salsa="Salsa de tomate";
        ingredientes.add("queso mozarella ");
        ingredientes.add("queso manchego");
        ingredientes.add("extra queso");
        ingredientes.add("cebolla");
    }

    @Override
    public void cocinar() {
        System.out.println("cocinando a 100 grados por 35 mins ");

    }

    @Override
    public void cortar() {
        System.out.println(" cortando la pizza en rebanadaas");

    }
}
