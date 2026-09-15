import java.util.Scanner;

public class Adivinha {

    public static int sorteiaNumeroInteiro(int maximo) {
        int x = (int) (Math.random()*(maximo+1)); //gera número inteiro aleatório entre [0-maximo]
        return x;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maxNum = 10;
        int pontos = 100;
        int y = sorteiaNumeroInteiro(maxNum);
        boolean acertou = false;
        int tentativas = 0;
        while(!acertou) {
            System.out.println("Tente adivinhar y [0-10]:");
            int numLido = Integer.parseInt(leitor.nextLine());
            tentativas++;
            if (numLido ==y) {
                System.out.println("Parabéns! Você acertou. Número de tentativas:"+tentativas);
                acertou = true;
            } else {
                System.out.println("Errou! Tente novamente");
            }
        }
        leitor.close();
    }

}