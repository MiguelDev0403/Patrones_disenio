package org.amoreno.patrones.absfactory;

import org.amoreno.patrones.absfactory.producto.PizzaNewYorkItaliana;
import org.amoreno.patrones.absfactory.producto.PizzaNewYorkPeperoni;
import org.amoreno.patrones.absfactory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto=null;
        switch (tipo) {
            case "Vegetariana":
                producto=new PizzaNewYorkVegetariana();
                break;
            case "Italiana":
                producto=new PizzaNewYorkItaliana();
                break;
            case "Peperoni":
                producto=new PizzaNewYorkPeperoni();
                break;

        }

        return producto;
    }
}
