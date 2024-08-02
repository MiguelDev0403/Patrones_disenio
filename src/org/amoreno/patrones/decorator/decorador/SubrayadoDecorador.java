package org.amoreno.patrones.decorator.decorador;

import org.amoreno.patrones.decorator.Formateable;

public class SubrayadoDecorador extends TextoDecorador {
    public SubrayadoDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String formate() {
        int largo=texto.formate().length();
        StringBuilder sb = new StringBuilder(texto.formate());
        sb.append("\n");
        for(int i=0; i<largo; i++) {
            sb.append("_");
        }
        return sb.toString();
    }
}

