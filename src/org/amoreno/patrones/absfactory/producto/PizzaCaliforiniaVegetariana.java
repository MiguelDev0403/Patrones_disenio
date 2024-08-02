package org.amoreno.patrones.absfactory.producto;

import org.amoreno.patrones.absfactory.PizzaProducto;

public class PizzaCaliforiniaVegetariana extends PizzaProducto {
    public PizzaCaliforiniaVegetariana() {
        super();
        nombre="Pizza California Vegetariana";
        masa="Masa delgada";
        salsa="salsa de tomate";
        ingredientes.add("queso manchego");
        ingredientes.add("espinacas");
        ingredientes.add("aceitunas");
        ingredientes.add("aguacate");



    }

    @Override
    public void cocinar() {
        System.out.println("cocinando pizza vegetariana a 150 grados por 30 mins ");
    }

    @Override
    public void cortar() {
        System.out.println("cortando pizza vegetariana en rectangulos ");
    }
}
