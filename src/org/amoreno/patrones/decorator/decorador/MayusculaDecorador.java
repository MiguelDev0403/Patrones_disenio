package org.amoreno.patrones.decorator.decorador;

import org.amoreno.patrones.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador {

    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String formate() {
        return texto.formate().toUpperCase();
    }
}
