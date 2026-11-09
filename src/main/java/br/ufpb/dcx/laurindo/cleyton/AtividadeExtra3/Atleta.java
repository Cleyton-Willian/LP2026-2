package br.ufpb.dcx.laurindo.cleyton.AtividadeExtra3;

import java.util.List;
public class Atleta {
    private String codigo;
    private int idade;
    private List<Telefone> telefones;


    public Atleta(String codigo, int idade, List<Telefone> telefones) {
        this.codigo = codigo;
        this.idade = idade;
        this.telefones = telefones;
    } //… outros métodos da classe

    public String getCodigo(){
        return this.codigo;
    }

    public int getIdade(){
        return this.idade;
    }
    public List<Telefone> getTelefones() {
        return this.telefones;
    }

    public void setCodigo(String nCodigo){
        this.codigo = nCodigo;
    }
    public void setIdade(int nIdade){
        this.idade = nIdade;
    }
    public void setTelefones(List<Telefone> nTelefones){
        this.telefones = nTelefones;
    }

    public String toStrin(){
        return "Codigo do jogador: " + this.codigo + "\n idade do jogador: " + this.idade + "\n telefone do jogador: " + this.telefones;
    }

    public void cadastraTelefone(Telefone tel){
        this.telefones.add(tel);
    }

}