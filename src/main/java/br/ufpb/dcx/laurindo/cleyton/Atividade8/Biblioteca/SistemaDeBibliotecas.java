package br.ufpb.dcx.laurindo.cleyton.Atividade8.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeBibliotecas implements SistemaBiblioteca {
    private List<Livro> livros;

    public SistemaDeBibliotecas(){
        this.livros = new ArrayList<>();
    }

    @Override
    public void cadastrarLivro(Livro livro){
        this.livros.add(livro);
    }

    @Override
    public Livro pesquisarLivro(String titulo){
        for(Livro livro: this.livros){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Livro encontrado com sucesso!")
                return livro;
            }
        }
        System.out.println("Livro não encontrado.");
        return null
    }

    @Override
    public List<Livro> getLivros(){
        return this.livros;
    }
}
