package br.ufpb.dcx.laurindo.cleyton.AtividadeExtra3;

public class Telefone {
    private String DDD;
    private String numero;
    private String tipo;

    public Telefone(String DDD, String numero, String tipo) {
        this.DDD = DDD;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String toString(){return "(" + this.DDD + ") " + this.numero;}




    } //… outros métodos da classe
