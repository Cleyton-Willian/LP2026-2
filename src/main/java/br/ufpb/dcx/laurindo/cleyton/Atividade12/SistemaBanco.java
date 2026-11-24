package br.ufpb.dcx.laurindo.cleyton.Atividade12;

import br.ufpb.dcx.laurindo.cleyton.Atividade7.dois.Conta;

import java.util.List;

public interface SistemaBanco {

    double consultarSaldoDeConta(String numConta, String numAgencia);

    double consultarSaldoDisponivelDeConta(String numConta, String numAgencia);

    List<Conta> pesquisarContasDoCliente(String cpfCliente);

    void transferir(String numContaO, String numAgenciaO, String numContaD,
                    String numAgenciaD, double valor);

    boolean abrirConta(Conta novaConta);

    List<Conta> pesquisarContasComSaldoNegativo();

    boolean sacarDeConta(String numConta, String numAgencia, double valor);

    boolean depositarEmConta(String numConta, String numAgencia, double valor);

}