package com.oracle;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Febona febona = new Febona();

        Nadador n1 = new Nadador("Michael Phelps", 88.0, 193);

        PruebaNatacion p1 = new PruebaNatacion(EstiloNatacion.MARIPOSA, 400);
        PruebaNatacion p2 = new PruebaNatacion(EstiloNatacion.LIBRE, 800);
        PruebaNatacion p3 = new PruebaNatacion(EstiloNatacion.ESPALDA, 200);

        n1.registrarPrueba(p1);
        n1.registrarPrueba(p2);
        n1.registrarPrueba(p3);

        Nadador n2 = new Nadador("Karen Torrez", 58.0, 165);

        PruebaNatacion p4 = new PruebaNatacion(EstiloNatacion.MARIPOSA, 200);
        PruebaNatacion p5 = new PruebaNatacion(EstiloNatacion.LIBRE, 50);
        PruebaNatacion p6 = new PruebaNatacion(EstiloNatacion.ESPALDA, 200);

        n2.registrarPrueba(p4);
        n2.registrarPrueba(p5);
        n2.registrarPrueba(p6);

        febona.registrarNadador(n1);
        febona.registrarNadador(n2);

        febona.mostrarNadadores();

        Nadador respuesta = febona.getNadadorMasAlto();

        System.out.println("El nadador mas alto: " + respuesta.getNombre());

        List<Nadador> res = febona.buscar("Mi");

        System.out.println("Resultados de la busqueda: ");
        res.forEach(n -> System.out.println(n.getNombre()));

        System.out.println("Los nombres de los nadadores en Mayusculas: ");
        febona.mostrarNombresNadadores();

        n2.mostrarPruebas();
    }
}
