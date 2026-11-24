package br.ufpb.dcx.laurindo.cleyton.AtividadeExtra3;

import java.util.List;
import java.util.Objects;

public class Atleta {
    private String codigo;
    private int idade;
    private List<Telefone> telefones;
    private boolean ehDiabetico;


    public Atleta(String codigo, int idade, List<Telefone> telefones) {
        this.codigo = codigo;
        this.idade = idade;
        this.telefones = telefones;
    } //… outros métodos da classe

    public boolean ehDiabetico(){return ehDiabetico;}
    public void setEhDiabetico(boolean ehDiabetico){this.ehDiabetico = ehDiabetico;}


    //equals() and hashCode()



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Atleta atleta = (Atleta) o;
        return Objects.equals(codigo, atleta.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }



    public String getCodigo(){
        return this.codigo;
    }
    public int getIdade(){
        return this.idade;
    }
    public List<Telefone> getTelefones() {
        return this.telefones;
    }

    public void setCodigo(String nCodigo){this.codigo = nCodigo;}
    public void setIdade(int nIdade){this.idade = nIdade;}
    public void setTelefones(List<Telefone> nTelefones){this.telefones = nTelefones;}

    public String toString(){
        return "Codigo do jogador: " + this.codigo + "\n idade do jogador: " + this.idade + "\n telefone do jogador: " + this.telefones;
    }

    public void cadastraTelefone(Telefone tel){
        this.telefones.add(tel);
    }
}