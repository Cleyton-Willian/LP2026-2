package br.ufpb.dcx.laurindo.cleyton.Atividade11;

import java.util.ArrayList;
import java.util.List;

public class TiturecoList implements TiturecoInterface{

    private List<AtrativoTuristico> atrativos;

    public TiturecoList() {
        this.atrativos = new ArrayList<>();
    }

    @Override
    public boolean cadastrarAtrativo(AtrativoTuristico atrativo) {
        if (atrativo == null || this.atrativos.contains(atrativo)) {
            return false;
        }
        return this.atrativos.add(atrativo);
    }

    @Override
    public boolean apagarAtrativo(String Atrativo, String cidade, String estado) {
        for (AtrativoTuristico atrativo : this.atrativos) {
            if (atrativo.getNome().equalsIgnoreCase(Atrativo) &&
                    atrativo.getCidade().equalsIgnoreCase(cidade) &&
                    atrativo.getEstado().equalsIgnoreCase(estado)) {
                return this.atrativos.remove(atrativo);
            }
        }
        return false;
    }

    @Override
    public List<AtrativoTuristico> getAtrativos() {
        return this.atrativos;
    }

    @Override
    public List<AtrativoTuristico> pesquisaAtrativosDaCidade(String cidade, String estado) {
        List<AtrativoTuristico> filtrados = new ArrayList<>();
        for (AtrativoTuristico atrativo : this.atrativos) {
            if (atrativo.getCidade().equalsIgnoreCase(cidade) &&
                    atrativo.getEstado().equalsIgnoreCase(estado)) {
                filtrados.add(atrativo);
            }
        }
        return filtrados;
    }
}