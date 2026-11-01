package br.ufpb.dcx.laurindo.cleyton.Atividade8.Biblioteca;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(){
        this("","");
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String toString(){
        return "O título do livro é: " + this.titulo + " e o autor do livro é " + this.autor;
    }

}
