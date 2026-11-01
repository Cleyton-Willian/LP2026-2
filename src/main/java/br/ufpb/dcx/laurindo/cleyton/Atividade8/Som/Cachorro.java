package br.ufpb.dcx.laurindo.cleyton.Atividade8.Som;

public class Cachorro implements EmissorDeSom {
    public String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    @Override
    public String emitirSom() {
        return "Au Au";
    }
}