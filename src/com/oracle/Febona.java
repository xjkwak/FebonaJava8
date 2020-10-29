package com.oracle;

import java.util.*;
import java.util.stream.Collectors;

public class Febona {

    private List<Nadador> nadadores;

    public Febona() {
        this.nadadores = new ArrayList<>();
    }

    public void registrarNadador(Nadador nadador) {
        this.nadadores.add(nadador);
    }

    public void mostrarNadadores() {
        System.out.println("Lista de nadadores mas sus pruebas: ");

        this.nadadores.forEach(n -> n.mostrarDatos());
    }

    public Nadador getNadadorMasAlto() {
        Nadador masAlto = this.nadadores.stream().
                max(Comparator.comparing(Nadador::getAltura)).
                orElseThrow(NoSuchElementException::new);

        return masAlto;
    }

    public List<Nadador> buscar(String nombre) {
        List<Nadador> lista = this.nadadores.stream().
                filter(n -> n.getNombre().contains(nombre)).
                collect(Collectors.toList());

        return lista;
    }

    public void mostrarNombresNadadores() {
        this.nadadores.stream().
                map(n -> n.getNombre().toUpperCase()).
                forEach(System.out::println);

    }

    public void mostrarListaNadadoresPorPeso() {
        Collections.sort(this.nadadores, (n1, n2) -> (int)(n1.getPeso() - n1.getPeso()));

        System.out.println("Lista ordenada por peso: ");
        this.nadadores.forEach(Nadador::mostrarDatos);
    }
}
