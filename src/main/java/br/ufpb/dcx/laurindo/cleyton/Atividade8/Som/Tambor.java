package br.ufpb.dcx.laurindo.cleyton.Atividade8.Som;

public class Tambor implements EmissorDeSom {
    private String tamanho;
    private String marca;

    public Tambor(String tamanho, String marca){
        this.tamanho = tamanho;
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getMarca(){
        return marca;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    @Override
    public String emitirSom(){
        return "Tum Tum Tum";
    }

}
