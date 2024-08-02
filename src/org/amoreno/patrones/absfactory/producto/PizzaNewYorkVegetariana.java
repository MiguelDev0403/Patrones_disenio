package org.amoreno.patrones.absfactory.producto;

import org.amoreno.patrones.absfactory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super();
        nombre  = "Pizza Vegetariana New York";
        masa= "Masa Integral Vegana ";
        salsa="Salsa de tomate";
        ingredientes.add("Queso Vegano");
        ingredientes.add("Tomates");
        ingredientes.add("aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas ");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando Pizza por 25 mins a 150 grados ");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas ");
    }
}
