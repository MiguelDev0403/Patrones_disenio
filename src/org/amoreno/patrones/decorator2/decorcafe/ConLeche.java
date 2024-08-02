package org.amoreno.patrones.decorator2.decorcafe;

import org.amoreno.patrones.decorator2.Configurable;

public class ConLeche extends CafeDecorador{
    public ConLeche(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecio() {
        return cafe.getPrecio()+7f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", con Leche ";
    }
}
