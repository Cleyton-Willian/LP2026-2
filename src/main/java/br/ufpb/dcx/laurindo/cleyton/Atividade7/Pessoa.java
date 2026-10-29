package br.ufpb.dcx.laurindo.cleyton.Atividade7;

public class Pessoa {

    public String nome;
    public int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }

    public String toString(){
        return "A pessoa com nome " + this.nome + " tem a idade de " + this.idade + " anos.";
    }

    public boolean ehDeMaior(){
        if(this.idade >= 18){
            return true;
        }
        return false;
    }

}
