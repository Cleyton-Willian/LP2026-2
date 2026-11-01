package br.ufpb.dcx.laurindo.cleyton.jogos;

public class Produto {
    public double preco;
    public String nomeProduto;

    public Double getpreco(){
        return this.preco;
    }
    public String nomeProduto(){
        return this.nomeProduto;
    }
    public void setpreco(double newPreco){
        this.preco = newPreco;
    }
    public void setnomeProduto(String alteraProduto){
        this.nomeProduto = alteraProduto;
    }
    public String toString(){
        return this.nomeProduto + "que tem o preço: " + this.preco;
    }
}
