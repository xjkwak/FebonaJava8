package com.oracle;

import java.util.ArrayList;
import java.util.List;

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
}
