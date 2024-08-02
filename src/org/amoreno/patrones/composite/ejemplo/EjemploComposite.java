package org.amoreno.patrones.composite.ejemplo;

import org.amoreno.patrones.composite.Archivo;
import org.amoreno.patrones.composite.Directorio;

public class EjemploComposite {
    public static void main(String[] args) {
        Directorio doc =new Directorio("Documentos");
        Directorio java =new Directorio("Java");
        java.addComponente(new Archivo("Patron-Composite.docx"));
        Directorio stream=new Directorio("Api Stream");
        stream.addComponente(new Archivo("Stream-Map.docx"));
        java.addComponente(stream);
        doc.addComponente(java);
        doc.addComponente(new Archivo("CV.pdf"));
        doc.addComponente(new Archivo("logo.jpeg"));
        System.out.println(doc.mostrar());

    }
}
