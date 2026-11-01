package br.ufpb.dcx.laurindo.cleyton.Atividade8.Biblioteca;
import java.util.List;

public interface SistemaBiblioteca {
    void cadastrarLivro(Livro livro);
    Livro pesquisarLivro(String titulo);
    List<Livro> getLivros();
}