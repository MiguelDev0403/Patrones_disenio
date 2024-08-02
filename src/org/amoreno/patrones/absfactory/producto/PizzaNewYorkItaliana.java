package org.amoreno.patrones.absfactory.producto;

import org.amoreno.patrones.absfactory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {
    public PizzaNewYorkItaliana() {
        super();

        nombre= "Pizza  New York Italiana ";
        masa="Masa gruesa a la piedera ";
        salsa="Salsa italiana";
        ingredientes.add("queso mozarella ");
        ingredientes.add("jamon");
        ingredientes.add("aceitunas ");

    }

    @Override
    public void cocinar() {
        System.out.println(" Cocinando la pizza por 35 mins a 150 grados ");
    }

    @Override
    public void cortar() {
        System.out.println(" Cortando  la  pizza en rebanadas ");
    }
}
