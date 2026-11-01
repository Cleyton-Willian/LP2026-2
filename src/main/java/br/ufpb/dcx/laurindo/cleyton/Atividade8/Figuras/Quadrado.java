package br.ufpb.dcx.laurindo.cleyton.Atividade8.Figuras;

public class Quadrado implements Figura {
    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public Quadrado() {
        this(0.0);
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
}