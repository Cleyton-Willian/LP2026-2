package br.ufpb.dcx.laurindo.cleyton.AtividadeExtra3;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class GravadorDeAtletas {
    public String nomeArquivoAtletas;

    public static final String NOME_ARQUIVO_ATLETAS_DEFAULT = "atletas.txt";

    public GravadorDeAtletas(String nomeArquivo){
        this.nomeArquivoAtletas = nomeArquivo;
    }

    public GravadorDeAtletas(){
        this(NOME_ARQUIVO_ATLETAS_DEFAULT);
    }

    public List<Atleta> recuperarAtletas() throws IOException{
        List<Atleta> atletas = new LinkedList<>();
        BufferedReader leitor = null;
        try{
            leitor = new BufferedReader(new FileReader(this.nomeArquivoAtletas));
            boolean terminou = false;
            while(!terminou){
                String linhaLida = leitor.readLine();
                if(linhaLida!=null) {
                    String[] dados = linhaLida.split("###");
                    String codigoAtleta = dados[0];
                    int idadeAtleta = Integer.parseInt(dados[1]);
                    Atleta atleta = new Atleta(codigoAtleta, idadeAtleta, new LinkedList<>());
                    atletas.add(atleta);
                }else{
                    terminou = true;
                }
            }
            return atletas;
        } finally{
            if(leitor!=null){
                leitor.close();
            }
        }

    }

    public void gravarAtletas(List<Atleta> atletas)
        throws IOException {
        BufferedWriter escritor = null;
        try{
            escritor = new BufferedWriter(new FileWriter(this.nomeArquivoAtletas));
            for(Atleta a: atletas){
                escritor.write(a.getCodigo()+"###"+a.getIdade()+"\n");
            }
        } finally {
            if(escritor!=null){
                escritor.close();
            }
        }
    }



}
