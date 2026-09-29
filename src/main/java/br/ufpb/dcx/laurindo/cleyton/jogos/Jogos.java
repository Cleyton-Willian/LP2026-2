package br.ufpb.dcx.laurindo.cleyton.jogos;

public class Jogos {
    private String nomeTime1, nomeTime2;
    private int numGolsTime1, numGolsTime2;


    public String getNomeTime1(){
        return this.nomeTime1;
    }

    public String getNomeTime2(){
        return this.nomeTime2;
    }

    public int getnumGolsTime1(){
        return this.numGolsTime1;
    }

    public int getnumGolsTime2(){
        return this.numGolsTime2;
    }

    public void setnomeTime1(String nomeTime1){
        this.nomeTime1 = nomeTime1;
    }

    public void setnomeTime2(String nomeTime2){
        this.nomeTime2 = nomeTime2;
    }


    public void setnumGolsTime1(int setnumGolsTime1){
        this.numGolsTime1 = setnumGolsTime1;
    }

    public void setnumGolsTime2(int setnumGolsTime2) {
        this.numGolsTime2 = setnumGolsTime2;

    public String toString() {
        return this.nomeTime1() + "que fez" + this.numGolsTime1() + "gols\n" + "Já o time" + this.nomeTime2() + "fez" + this.numGolsTime2() + "gols";
    }

}
