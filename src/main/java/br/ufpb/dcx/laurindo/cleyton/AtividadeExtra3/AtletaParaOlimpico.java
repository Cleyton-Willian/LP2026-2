package br.ufpb.dcx.laurindo.cleyton.AtividadeExtra3;

import java.util.List;

public class AtletaParaOlimpico extends Atleta{

    private String tipoAtletaParaOlimpico;

    public AtletaParaOlimpico(String codigo, int idade, List<Telefone> telefones, String tipoAtletaParaOlimpico){
        super(codigo, idade, telefones);
        this.tipoAtletaParaOlimpico = tipoAtletaParaOlimpico;
    }

    public String getTipoAtletaParaOlimpico() {return tipoAtletaParaOlimpico;}

    public void setTipoAtletaParaOlimpico(String tipoAtletaParaOlimpico){this.tipoAtletaParaOlimpico = tipoAtletaParaOlimpico;}



}
