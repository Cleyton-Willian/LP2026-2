package br.ufpb.dcx.laurindo.cleyton.Atividade7.dois;
import java.util.ArrayList;

public class TestaBanco {
    public static void main(String [] args) {
        BancoList meuBanco = new BancoList("Ayla's Bank", "123/321", new ArrayList<Conta>());

        meuBanco.abrirConta("111.111.111-11", "222-2", "333-3", 100);
        System.out.println("Saldo inicial da conta 222-2: " + meuBanco.consultarSaldoDeConta("222-2", "333-3"));

        BancoList novoBanco = new BancoList("Cleyton's Bank", "321/123", new ArrayList<Conta>());
        novoBanco.abrirConta("222.222.222-22", "444-4", "555-5", 0.0);

        System.out.println("Saldo inicial da conta 444-4: " + novoBanco.consultarSaldoDeConta("444-4", "555-5"));

        meuBanco.abrirConta("222.222.222-22", "444-4", "555-5", 0.0);
        meuBanco.transferir("222-2", "333-3", "444-4", "555-5", 100.0);

        double saldoContaDestino = meuBanco.consultarSaldoDeConta("444-4", "555-5");
        System.out.println("Saldo da conta 444-4 após a transferência: " + saldoContaDestino);

        ArrayList<Conta> contasNegativas = meuBanco.pesquisarContasComSaldoNegativo();
        System.out.println("\n--- Contas com Saldo Negativo ---");
        for (Conta c : contasNegativas) {
            System.out.println(c);
        }
    }
}

