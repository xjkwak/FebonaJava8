package com.oracle;

public class PruebaNatacion {
    private EstiloNatacion estiloNatacion;
    private int distancia; //en metros

    public PruebaNatacion(EstiloNatacion estiloNatacion, int distancia) {
        this.estiloNatacion = estiloNatacion;
        this.distancia = distancia;
    }

    public EstiloNatacion getEstiloNatacion() {
        return estiloNatacion;
    }

    public void setEstiloNatacion(EstiloNatacion estiloNatacion) {
        this.estiloNatacion = estiloNatacion;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void mostrar() {
        System.out.println("Estilo: " + estiloNatacion);
        System.out.println("Distancia: " + distancia);
    }
}
