package br.ufpb.dcx.laurindo.cleyton.AtividadeExtra4Medicamentos;

public class Medicamento {
    private String nome;
    private int dosagem;
    private int hora;

    public Medicamento(String nome, int dosagem, int hora) {
        this.nome = nome;
        this.dosagem = dosagem;
        this.hora = hora;
    }

    public String getNome(){
        return this.nome;
    }

    public int getDosagem(){
        return this.dosagem;
    }

    public int getHora(){
        return this.hora;
    }

    public void setDosagem(int dosagem){
        this.dosagem = dosagem;
    }

    public void setHora(int hora){
        this.hora = hora;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String toString() {
        return "Medicamento: " + nome + " (" + dosagem + "mg) às " + hora + "h";
    }     //… outros métodos da classe
}
