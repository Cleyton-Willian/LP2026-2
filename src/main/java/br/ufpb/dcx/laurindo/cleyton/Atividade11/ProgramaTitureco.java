package br.ufpb.dcx.laurindo.cleyton.Atividade11;

import java.util.List;

public class ProgramaTitureco {

    public static void main(String[] args) {

        // 1. Instanciar o sistema (TiturecoList) através da interface
        TiturecoInterface sistema = new TiturecoList();

        // 2. Criar alguns atrativos do tipo Praia
        Praia praia1 = new Praia("Praia de Tambaú", -7.11, -34.82, "De carro",
                "João Pessoa", "PB", true, false, Praia.TIPO_ONDAS_MEDIAS);

        Praia praia2 = new Praia("Praia de Cabo Branco", -7.13, -34.79, "A pé ou de bicicleta",
                "João Pessoa", "PB", true, false, Praia.TIPO_ONDAS_MEDIAS);

        Praia praia3 = new Praia("Praia de Boa Viagem", -8.12, -34.90, "De carro",
                "Recife", "PE", true, true, Praia.TIPO_ONDAS_FORTES);

        // 3. Testar o cadastro
        System.out.println("--- CADASTRAR ATRATIVOS ---");
        System.out.println("Cadastrou Tambaú? " + sistema.cadastrarAtrativo(praia1));
        System.out.println("Cadastrou Cabo Branco? " + sistema.cadastrarAtrativo(praia2));
        System.out.println("Cadastrou Boa Viagem? " + sistema.cadastrarAtrativo(praia3));

        // Testar impedir duplicados (deve retornar false)
        System.out.println("Cadastrou Tambaú de novo? " + sistema.cadastrarAtrativo(praia1));
        System.out.println();

        // 4. Listar todos os atrativos
        System.out.println("--- TODOS OS ATRATIVOS ---");
        List<AtrativoTuristico> todos = sistema.getAtrativos();
        for (AtrativoTuristico a : todos) {
            System.out.println(a.getNome() + " (" + a.getCidade() + " - " + a.getEstado() + ")");
        }
        System.out.println();

        // 5. Testar a pesquisa por cidade e estado
        System.out.println("--- PESQUISA: JOÃO PESSOA / PB ---");
        List<AtrativoTuristico> atrativosJP = sistema.pesquisaAtrativosDaCidade("João Pessoa", "PB");
        for (AtrativoTuristico a : atrativosJP) {
            System.out.println(a.getNome());
        }
        System.out.println();

        // 6. Testar a remoção
        System.out.println("--- APAGAR ATRATIVO ---");
        boolean apagou = sistema.apagarAtrativo("Praia de Cabo Branco", "João Pessoa", "PB");
        System.out.println("Apagou Cabo Branco? " + apagou);

        // Tentar apagar algo que não existe (deve retornar false)
        boolean apagouFalso = sistema.apagarAtrativo("Praia Inexistente", "Natal", "RN");
        System.out.println("Apagou praia inexistente? " + apagouFalso);
        System.out.println();

        // 7. Listar todos novamente para confirmar a exclusão
        System.out.println("--- LISTA FINAL APÓS REMOÇÃO ---");
        for (AtrativoTuristico a : sistema.getAtrativos()) {
            System.out.println(a.getNome() + " (" + a.getCidade() + " - " + a.getEstado() + ")");
        }
    }
}