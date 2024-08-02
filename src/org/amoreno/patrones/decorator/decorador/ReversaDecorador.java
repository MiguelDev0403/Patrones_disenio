package org.amoreno.patrones.decorator.decorador;

import org.amoreno.patrones.decorator.Formateable;

public class ReversaDecorador extends TextoDecorador{

    public ReversaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String formate() {
        StringBuilder sb = new StringBuilder(texto.formate());
        return sb.reverse().toString();
    }
}
