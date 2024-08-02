package org.amoreno.patrones.decorator2.decorcafe;

import org.amoreno.patrones.decorator2.Configurable;

abstract public class CafeDecorador implements Configurable {
    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }
}
