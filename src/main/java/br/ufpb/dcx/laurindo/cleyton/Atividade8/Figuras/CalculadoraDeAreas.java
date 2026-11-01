package br.ufpb.dcx.laurindo.cleyton.Atividade8.Figuras;

import java.util.ArrayList;

public class CalculadoraDeAreas{

    public static void main(String [] args){
        ArrayList <Figura> figuras = new ArrayList < > ();
        figuras.add(new Quadrado(2));
        figuras.add(new Triangulo(3,2));
        double areaTotal = 0.0;
        for (Figura f: figuras){
            System.out.println(f.calcularArea());
            double areaAtual = f.calcularArea();
            areaTotal += areaAtual;
        }
        System.out.printf("Área total: %.1f\n", areaTotal);
    }

}