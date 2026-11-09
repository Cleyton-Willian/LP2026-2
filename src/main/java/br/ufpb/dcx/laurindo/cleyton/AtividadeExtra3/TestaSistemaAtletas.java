package br.ufpb.dcx.laurindo.cleyton.AtividadeExtra3;

import java.util.ArrayList;
import java.util.List;

public class TestaSistemaAtletas {
    public static void main(String[] args) {
        SistemaGerenciaDeAtletas sistema = new MeuSistemaGerenciaDeAtletas();

        sistema.cadastrarAtleta("CX123", 20, new ArrayList<>());
        sistema.cadastrarTelefoneDeAtleta("CX123", new Telefone("83", "99998888", "Celular"));
        sistema.cadastrarTelefoneDeAtleta("CX123", new Telefone("83", "33335555", "Fixo"));

        sistema.cadastrarAtleta("CX555", 50, new ArrayList<>());

        List<Atleta> listaAtletas = sistema.pesquisarAtletasComIdadeEntre(15, 20);
        for (Atleta a : listaAtletas) {
            System.out.println("Código:" + a.getCodigo() + ", Idade:" + a.getIdade());
        }

        // Finalizado:
        sistema.cadastrarAtleta("CX999", 45, new ArrayList<>());
        sistema.cadastrarTelefoneDeAtleta("CX999", new Telefone("83", "989999999", "Celular"));

        int maiorIdade = sistema.pesquisarMaiorIdadeDosAtletas();
        System.out.println("Maior idade: " + maiorIdade);
    }
}