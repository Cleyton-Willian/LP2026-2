package br.ufpb.dcx.laurindo.cleyton.AtividadeExtra3;

import java.util.ArrayList;
import java.util.List;

public class MeuSistemaGerenciaDeAtletas implements SistemaGerenciaDeAtletas {

    private List<Atleta> atletas;

    public MeuSistemaGerenciaDeAtletas() {
        this.atletas = new ArrayList<>();
    }

    @Override
    public boolean cadastrarAtleta(String codigo, int idade, List<Telefone> telefones) {
        Atleta novoAtleta = new Atleta(codigo, idade, telefones);
        for(int k=0;k<atletas.size();k++){
            if(atletas.get(k).getCodigo().equals(codigo)){
                return false;
            }
        }
        atletas.add(novoAtleta);
        return true;
    }

    @Override
    public boolean cadastrarTelefoneDeAtleta(String codigo, Telefone tel) {
        for (Atleta a : this.atletas) {
            if (a.getCodigo().equals(codigo)) {
                a.cadastraTelefone(tel); // Supondo que o método na classe Atleta seja este
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Atleta> pesquisarAtletasComIdadeEntre(int idadeInferior, int idadeSuperior) {
        List<Atleta> listaAtletasPorIdade = new ArrayList<>();
        for (Atleta a : this.atletas) {
            if (a.getIdade() >= idadeInferior && a.getIdade() <= idadeSuperior) {
                listaAtletasPorIdade.add(a);
            }
        }
        return listaAtletasPorIdade;
    }

    @Override
    public int pesquisarMaiorIdadeDosAtletas() {
        int maiorIdade = 0;
        for (Atleta a : this.atletas) {
            if (a.getIdade() > maiorIdade) {
                maiorIdade = a.getIdade();
            }
        }
        return maiorIdade;
    }

    @Override
    public boolean apagarTelefoneDeAtleta(String codigo, Telefone telefone) {
        for (Atleta a : this.atletas) {
            if (a.getCodigo().equals(codigo)) {
                return a.getTelefones().remove(telefone);
            }
        }
        return false;
    }
}