package br.ufpb.dcx.laurindo.cleyton.Atividade5;

import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros");
        int[] numeros = new int[5];

        for (int l=0;l<5;l++) {
            numeros[l] = leitor.nextInt();
        }
        int menor = numeros[0];
        for(int i=1; i<numeros.length; i++){
            if (numeros[i]< menor){
                menor = numeros[i];
            }
        }
        leitor.close();
        System.out.println("O menor número é: " + menor);
    }
}
