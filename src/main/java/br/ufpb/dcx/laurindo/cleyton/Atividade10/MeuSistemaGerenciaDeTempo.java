package br.ufpb.dcx.laurindo.cleyton.Atividade10;

import java.util.ArrayList;
import java.util.List;

public class MeuSistemaGerenciaDeTempo implements SistemaGerenciaDeTempo{

    private List<Tarefa> tarefas;

    public MeuSistemaGerenciaDeTempo() {
        this.tarefas = new ArrayList<>();
    }

    public List<Tarefa> pesquisarTarefasDaCategoria(String categoria) {
        List<Tarefa> tarefasPesq = new ArrayList<>();
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getCategoria().equals(categoria)) {
                tarefasPesq.add(tarefa);
            }
        }
        return tarefasPesq;
    }

    // feito para a att(questão 1) - Ajustado para singular
    public void cadastrarTarefa(String descricao, String categoria, int tempoEmMinutos){
        Tarefa t = new Tarefa(descricao, categoria, tempoEmMinutos);
        this.tarefas.add(t);
    }

    public int calcularTempoTotalDeTarefasComDescricao(String descricaoTarefa){
        int tempoTotal = 0;
        for(Tarefa t: this.tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricaoTarefa)) {
                tempoTotal += t.getTempoTarefaEmMinutos();
            }
        }
        return tempoTotal; // CORREÇÃO: Faltava retornar o valor
    }

    // Nome corrigido para bater com a Interface
    public List<Tarefa> pesquisarTarefasQueDuraramMaisDe(int tempoEmMinutos){
        List<Tarefa> tarefasPorDuracao = new ArrayList<>();
        for(Tarefa t: this.tarefas){
            if(t.getTempoTarefaEmMinutos() > tempoEmMinutos) {
                tarefasPorDuracao.add(t);
            }
        }
        return tarefasPorDuracao; // CORREÇÃO: Faltava retornar a lista
    }

    // feito para a att(questão 2)
    public int calcularTempoTotalDeTarefasDaCategoria(String categoriaTarefa){
        int tempoTotal = 0;
        for(Tarefa t: this.tarefas){
            if(t.getCategoria().equalsIgnoreCase(categoriaTarefa)) {
                tempoTotal += t.getTempoTarefaEmMinutos();
            }
        }
        return tempoTotal; // CORREÇÃO: Faltava retornar o valor
    }

    // Método adicionado para cumprir o contrato da Interface
    public List<Tarefa> pesquisarTarefasPorDescricao(String descricao){
        List<Tarefa> tarefasPorDesc = new ArrayList<>();
        for(Tarefa t: this.tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasPorDesc.add(t);
            }
        }
        return tarefasPorDesc;
    }
}