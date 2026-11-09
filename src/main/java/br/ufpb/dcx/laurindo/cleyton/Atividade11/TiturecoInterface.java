package br.ufpb.dcx.laurindo.cleyton.Atividade11;

import java.util.List;

public interface TiturecoInterface {
    boolean cadastrarAtrativo(AtrativoTuristico atrativo);
    boolean apagarAtrativo(String NomeAtrativo, String cidade, String estado);
    List<AtrativoTuristico> getAtrativos();
    List<AtrativoTuristico> pesquisaAtrativosDaCidade(String cidade, String estado);
}
