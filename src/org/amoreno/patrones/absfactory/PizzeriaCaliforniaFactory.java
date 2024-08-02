package org.amoreno.patrones.absfactory;

import org.amoreno.patrones.absfactory.producto.PizzaCaliforiniaVegetariana;
import org.amoreno.patrones.absfactory.producto.PizzaCaliforniaPeperoni;
import org.amoreno.patrones.absfactory.producto.PizzaCaliforniaQueso;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto=null;
        switch (tipo) {
            case "California Queso":
                producto= new PizzaCaliforniaQueso();
                break;
            case "California Peperoni":
                producto= new PizzaCaliforniaPeperoni();
                break;
            case "California Vegetariana":
                producto= new PizzaCaliforiniaVegetariana();
                break;

        }
        return producto;
    }
}
