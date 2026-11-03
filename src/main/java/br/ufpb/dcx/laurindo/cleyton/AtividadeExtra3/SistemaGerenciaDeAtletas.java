package br.ufpb.dcx.laurindo.cleyton.AtividadeExtra3;

/**
 * Sistema para gerenciar atletas em um campeonato(Isso é um JavaDOC)
 */

import java.util.List;
public interface SistemaGerenciaDeAtletas {
    public void cadastrarAtleta(String codigoAtleta, int idade, List<Telefone> telefones);
    public List<Atleta> pesquisarAtletasComIdadeEntre(int idadeInferior, int idadeSuperior);
    public int pesquisarMaiorIdadeDosAtletas();
    public boolean cadastrarTelefoneDeAtleta(String codigoAtleta, Telefone tel);
    public boolean apagarTelefoneDeAtleta(String codigoAtleta, Telefone tel);
}

