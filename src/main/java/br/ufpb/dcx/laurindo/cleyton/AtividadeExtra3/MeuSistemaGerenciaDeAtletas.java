package br.ufpb.dcx.laurindo.cleyton.AtividadeExtra3;

import java.util.ArrayList;
import java.util.List;
public class MeuSistemaGerenciaDeAtletas implements SistemaGerenciaDeAtletas{
    private List<Atleta> atletas;
    public MeuSistemaGerenciaDeAtletas(){
        this.atletas = new ArrayList<>();
    }
    public boolean cadastrarTelefoneDeAtleta(String codigoAtleta, Telefone tel) {
        for (Atleta a : this.atletas) {
            if (a.getCodigo().equals(codigoAtleta)) {
                a.cadastraTelefone(tel);
                return true;
            }
        }
        return false;
    }

    public List<Atleta> pesquisarAtletasComIdadeEntre(int idadeInferior, int idadeSuperior){
        List<Atleta> listaAtletasPorIdade = new ArrayList<>();
        for(Atleta a: this.atletas){
            if (a.getIdade() >= idadeInferior && a.getIdade() <= idadeSuperior) {
                listaAtletasPorIdade.add(a);
            }
        }
        return listaAtletasPorIdade;
    }

    public int pesquisaMaiorIdadeDosAtletas(){
        return 0;
        //TODO!
    }

    public boolean apagarTelefoneDosAtletas(){
        return false;
        //TODO!
    }

    public void Atleta(String codigo, int idade, List<Telefone> telefones) {
        //TODO!
    }

    }//… Outros métodos da classe
