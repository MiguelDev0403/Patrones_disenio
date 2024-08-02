package org.amoreno.patrones.decorator2;

import org.amoreno.patrones.decorator2.decorcafe.ConChocolate;
import org.amoreno.patrones.decorator2.decorcafe.ConCrema;
import org.amoreno.patrones.decorator2.decorcafe.ConLeche;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {
        Configurable cafe=new Cafe(15," Cafe Moka");
        ConCrema crema=new ConCrema(cafe);
        ConLeche leche=new ConLeche(crema);
        ConChocolate chocolate=new ConChocolate(leche);
        System.out.println(" El precio del Cafe Moka es : " + chocolate.getPrecio());
        System.out.println(" Los ingredientes :  "  + chocolate.getIngredientes());
        System.out.println("\n-----------------------------------------------------\n");
        Configurable capuchino=new Cafe(16," Cafe Capuccino ");
        ConCrema conCrema=new ConCrema(capuchino);
        ConLeche conLeche=new ConLeche(conCrema);

        System.out.println(" El precio del Cafe capuccino es : " + conLeche.getPrecio());
        System.out.println(" Los ingredientes :  "  + conLeche.getIngredientes());

    }
}
