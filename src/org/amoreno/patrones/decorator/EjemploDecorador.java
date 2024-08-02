package org.amoreno.patrones.decorator;

import org.amoreno.patrones.decorator.decorador.MayusculaDecorador;
import org.amoreno.patrones.decorator.decorador.ReemplazarEspacio;
import org.amoreno.patrones.decorator.decorador.ReversaDecorador;
import org.amoreno.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto= new Texto("OTSUG OHCUM LEUGIM ALOH");
        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa =new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayado= new SubrayadoDecorador(reversa);
        ReemplazarEspacio reemplazr= new ReemplazarEspacio(subrayado);
        System.out.println(reemplazr.formate());
    }
}
