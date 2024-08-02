package org.amoreno.patrones.decorator;

public class Texto implements Formateable {
   private String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public String formate() {
        return getTexto();
    }
}
