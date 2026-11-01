package br.ufpb.dcx.laurindo.cleyton.Atividade8.Som;

public class TestaCaixaDeSom {

    public static void main(String [] args) {
        CaixaDeSom caixa = new CaixaDeSom();
        caixa.adicionarEmissor(new Cachorro("Bob"));
        caixa.adicionarEmissor(new Tambor("P", "Giannini" ));
        caixa.adicionarEmissor(new Cachorro("Mike"));
        caixa.adicionarEmissor(new Cachorro("Adelcio"));
        caixa.adicionarEmissor(new Tambor("G", "Giannini"));
        caixa.tocarTodosOsEmissores();
    }

}
