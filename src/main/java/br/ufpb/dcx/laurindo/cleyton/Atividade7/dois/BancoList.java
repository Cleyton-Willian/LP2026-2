package br.ufpb.dcx.laurindo.cleyton.Atividade7.dois;
import br.ufpb.dcx.laurindo.cleyton.Atividade7.Pessoa;

import java.util.ArrayList;

public class BancoList {
    private String nome;
    private String cnpj;
    private ArrayList<Conta> contas;

    public BancoList(String nome, String cnpj, ArrayList<Conta> contas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = contas;
    }

    public String toString() {
        return "Banco " + this.nome + " de CNPJ " + this.cnpj + " e que tem " + this.contas.size() + " contas";
    }

    public void transferir(String numContaO, String numAgO, String numContaD, String numAgenciaD, double valor) {
        Conta origem = null;
        Conta destino = null;

        // 1. Procurar as contas de origem e destino na lista
        for (Conta c : this.contas) {
            if (c.getNumeroConta().equals(numContaO) && c.getNumeroAgencia().equals(numAgO)) {
                origem = c;
            }
            if (c.getNumeroConta().equals(numContaD) && c.getNumeroAgencia().equals(numAgenciaD)) {
                destino = c;
            }
        }

        // 2. Verificar se ambas as contas existem
        if (origem != null && destino != null) {
            // 3. Verificar se o valor é positivo e se a origem tem saldo suficiente
            if (valor > 0 && origem.getSaldo() >= valor) {
                // Realiza a transferência
                origem.setSaldo(origem.getSaldo() - valor);
                destino.setSaldo(destino.getSaldo() + valor);
                System.out.println("Transferência realizada com sucesso!");
            } else {
                System.out.println("Erro: Saldo insuficiente ou valor inválido.");
            }
        } else {
            System.out.println("Erro: Conta de origem ou destino não encontrada.");
        }
    }

    public void abrirConta(String cpfTitular, String numConta, String numAgencia, double saldoInicial) {
        Conta novaConta = new Conta();
        this.contas.add(novaConta);
    }

    public ArrayList<Conta> pesquisarContasComSaldoNegativo() {
        ArrayList<Conta> contasNegativas = new ArrayList<>();
        for(Conta c: this.contas){
            if(c.getSaldo() < 0){
                contasNegativas.add(c);
            }
        }
        return contasNegativas;
    }

    public double consultarSaldoDeConta(String numConta, String numAgencia) {
        double saldo = 0;
        for (Conta c : this.contas) {
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)) {
                saldo = c.getSaldo();
            }
        }
        return saldo;
    }// ...

    public double sacarDeConta(String numConta, String numAgencia, double valor) {
        // TODO: IMPLEMENTAR
        return 0.0;
    }

    public double depositarEmConta(String numConta, String numAgencia, double valor) {
        // TODO: IMPLEMENTAR
        return 0.0;
    }

    public ArrayList<Conta> pesquisarContasDoCliente(String cpf) {
        // TODO: IMPLEMENTAR
        return null;
    }
}