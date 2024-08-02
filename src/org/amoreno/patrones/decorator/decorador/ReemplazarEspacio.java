package org.amoreno.patrones.decorator.decorador;

import org.amoreno.patrones.decorator.Formateable;

public class ReemplazarEspacio extends TextoDecorador{

    public ReemplazarEspacio(Formateable texto) {
        super(texto);
    }

    @Override
    public String formate() {
        return texto.formate().replace(" ","**");

    }
}
