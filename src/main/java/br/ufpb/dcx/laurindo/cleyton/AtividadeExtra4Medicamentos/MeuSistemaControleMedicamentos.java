package br.ufpb.dcx.laurindo.cleyton.AtividadeExtra4Medicamentos;

import java.util.ArrayList;
import java.util.List;

public class MeuSistemaControleMedicamentos implements SistemaControleMedicamentos{
    private List<Medicamento> medicamentos;
    public  MeuSistemaControleMedicamentos() {
        medicamentos = new ArrayList<>();
    }

    @Override
    public List<Medicamento> pesquisarMedicamentosPorHora(int hora){
        List<Medicamento> medicamentosPorHora = new ArrayList<>();
        for(Medicamento m: medicamentos){
            if(m.getHora() == hora){
                medicamentosPorHora.add(m);
            }
        }
        return medicamentosPorHora;
    }

    @Override
    public int calcularDosagemTotalDoDia(String nomeMedicamento){
        int total = 0;
        for(Medicamento m: medicamentos){
            if(m.getNome().equals(nomeMedicamento));
            total += m.getDosagem();
        }

        return total;
    }

    public void cadastrarMedicamento(String nome, int dosagem, int hora){
        Medicamento m = new Medicamento(nome, dosagem, hora);
        medicamentos.add(m);
    }

    @Override
    public List<Medicamento> filtrarMedicamentosNoturnos(){
        List<Medicamento> listaMed = new ArrayList<>();
        for (Medicamento m: this.medicamentos){
            if(m.getHora() >= 18){
                listaMed.add(m);
            }
        }
        return listaMed;
    }
    // ... outros métodos
}
