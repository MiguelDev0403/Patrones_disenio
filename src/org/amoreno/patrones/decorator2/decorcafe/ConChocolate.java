package org.amoreno.patrones.decorator2.decorcafe;

import org.amoreno.patrones.decorator2.Configurable;

public class ConChocolate extends CafeDecorador {
    public ConChocolate(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecio() {
        return cafe.getPrecio()+5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes()+", Chocolate";
    }
}
