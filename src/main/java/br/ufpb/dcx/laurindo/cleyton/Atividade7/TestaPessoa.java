package br.ufpb.dcx.laurindo.cleyton.Atividade7;
import java.util.ArrayList;
import java.util.Scanner;

public class TestaPessoa {
    public static void main(String[] args){
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int cont = 0;
        Scanner scan = new Scanner(System.in);
        while(cont < 5){
            System.out.println("Digite seu nome: ");
            String nome = scan.nextLine();
            System.out.println("Digite sua idade: ");
            int idade = Integer.parseInt(scan.nextLine());
            cont++;
            pessoas.add(new Pessoa(nome, idade));
        }
        for(Pessoa p : pessoas){
            if(p.ehDeMaior()){
                System.out.println(p.nome + " é de maior!");
            } else{
                System.out.println(p.nome + " é de menor!");
            }
        }
    }

}
