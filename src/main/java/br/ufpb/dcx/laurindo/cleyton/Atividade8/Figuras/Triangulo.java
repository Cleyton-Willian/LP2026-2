package br.ufpb.dcx.laurindo.cleyton.Atividade8.Figuras;

public class Triangulo implements Figura {
    public double base;
    public double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return this.base;
    }
    public void setBase(double novaBase){
        this.base = novaBase;
    }
    public double getAltura(){
        return this.altura = altura;
    }
    public void setAltura(double novaAltura){
        this.altura = novaAltura;
    }
    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2.0;
    }
}