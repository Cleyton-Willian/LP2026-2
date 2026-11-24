package br.ufpb.dcx.laurindo.cleyton.AtividadeExtra3;

import java.util.ArrayList;
import java.util.List;

public class TestaSistemaAtletas {
    public static void main(String[] args) {
        SistemaGerenciaDeAtletas sistema = new MeuSistemaGerenciaDeAtletas();

        try {
            sistema.cadastrarAtleta("CX123", 20, new ArrayList<>());
            sistema.cadastrarAtleta("CX555", 50, new ArrayList<>());
        } catch(AtletaJaExisteException e){
            System.out.println("Atleta já existe");
        }

        sistema.cadastrarTelefoneDeAtleta("CX123", new Telefone("83", "99998888", "Celular"));
        sistema.cadastrarTelefoneDeAtleta("CX123", new Telefone("83", "33335555", "Fixo"));

        List<Atleta> listaAtletas = sistema.pesquisarAtletasComIdadeEntre(15, 20);
        for (Atleta a : listaAtletas) {
            System.out.println("Código:" + a.getCodigo() + ", Idade:" + a.getIdade());
        }

        // Finalizado:
        try {
            sistema.cadastrarAtleta("CX999", 45, new ArrayList<>());
        }catch(AtletaJaExisteException e){
            System.out.println("Atleta já existe");
        }
        sistema.cadastrarTelefoneDeAtleta("CX999", new Telefone("83", "989999999", "Celular"));

        int maiorIdade = sistema.pesquisarMaiorIdadeDosAtletas();
        System.out.println("Maior idade: " + maiorIdade);
    }
}