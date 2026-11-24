package br.ufpb.dcx.laurindo.cleyton.Atividade12;

public class ContaSimples extends Conta{

    public ContaSimples(String cpf, String numC,
                        String numAg, double saldo) {
        super(cpf, numC, numAg, saldo);
    }


    @Override
    public double getSaldoDisponivel() {
        return super.getSaldo();
    }


}