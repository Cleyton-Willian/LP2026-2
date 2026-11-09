package br.ufpb.dcx.laurindo.cleyton.AtividadeExtra4Medicamentos;

import java.util.List;

public class TestaMedicamentos {
    public static void main(String[] args) {
        SistemaControleMedicamentos sistema = new MeuSistemaControleMedicamentos();
        sistema.cadastrarMedicamento("Amoxicilina", 500, 8);
        sistema.cadastrarMedicamento("Amoxicilina", 500, 20);
        sistema.cadastrarMedicamento("Vitamina C", 1000, 10);
        System.out.println(sistema.calcularDosagemTotalDoDia("Amoxicilina"));
        List<Medicamento> lista = sistema.pesquisarMedicamentosPorHora(8);
        for (Medicamento m : lista) {
            System.out.println(m.toString());
        }
        //TODO: completar a partir daqui
        sistema.cadastrarMedicamento("Insulina", 10, 22);
        List<Medicamento> medicamentosNoturnos = sistema.filtrarMedicamentosNoturnos();

        for (Medicamento m : medicamentosNoturnos) {
            System.out.println("Nome o medicamento: " + m.getNome());
        }
    }
}
