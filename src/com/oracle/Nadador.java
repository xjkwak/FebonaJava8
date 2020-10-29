package com.oracle;

import java.util.ArrayList;
import java.util.List;

public class Nadador {
    private String nombre;
    private double peso; // en Kg
    private int altura; //en cm
    private List<PruebaNatacion> pruebas;

    public Nadador(String nombre, double peso, int altura)
    {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.pruebas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void registrarPrueba(PruebaNatacion prueba) {
        this.pruebas.add(prueba);
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Peso en Kg: " + this.peso);
        System.out.println("Altura en cm: " + this.altura);

        System.out.println("Pruebas del nadador: ");
//        for (PruebaNatacion p: this.pruebas) {
//            p.mostrar();
//        }
        this.pruebas.forEach(p -> p.mostrar());

        System.out.println();
    }
}
