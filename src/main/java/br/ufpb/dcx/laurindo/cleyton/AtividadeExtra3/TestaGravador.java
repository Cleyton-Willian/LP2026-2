package br.ufpb.dcx.laurindo.cleyton.AtividadeExtra3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestaGravador {
    public static void main(String [] args){

        GravadorDeAtletas gravador = new GravadorDeAtletas();


        List<Atleta> atletasList  = new ArrayList<>();

        try {
            atletasList = gravador.recuperarAtletas();
            System.out.println("Dados recuperados com sucesso:"+ atletasList.size()+" atletas recuperados");
        } catch(IOException e){
            System.out.println("Erro:Dados não recuperados");
            e.printStackTrace();
        }

        atletasList.add(new Atleta("DS987", 25, new ArrayList<>()));
        atletasList.add(new Atleta("ABC123", 17, new ArrayList<>()));

        try {
            gravador.gravarAtletas(atletasList);
            System.out.println("Dados salvos com sucesso");
        } catch(IOException e){
            System.out.println("Dados não salvos");
            e.printStackTrace();
        }
    }
}
