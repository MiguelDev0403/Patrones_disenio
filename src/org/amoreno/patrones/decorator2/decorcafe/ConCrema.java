package org.amoreno.patrones.decorator2.decorcafe;

import org.amoreno.patrones.decorator2.Configurable;

public class ConCrema extends CafeDecorador {
    public ConCrema(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecio() {
        return cafe.getPrecio()+2.5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes()+", Crema";
    }
}
