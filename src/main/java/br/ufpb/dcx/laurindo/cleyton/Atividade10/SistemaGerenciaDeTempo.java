package br.ufpb.dcx.laurindo.cleyton.Atividade10;
import java.util.List;

public interface SistemaGerenciaDeTempo {
    void cadastrarTarefa(String descricao, String categoria, int tempoEmMinutos);
    List<Tarefa> pesquisarTarefasDaCategoria(String categoria);
    List<Tarefa> pesquisarTarefasQueDuraramMaisDe(int tempoEmMinutos);
    int calcularTempoTotalDeTarefasDaCategoria(String categoriaTarefa);
    int calcularTempoTotalDeTarefasComDescricao(String descricaoTarefa);
    List<Tarefa> pesquisarTarefasPorDescricao(String descricao);
}