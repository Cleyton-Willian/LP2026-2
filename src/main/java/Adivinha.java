import java.util.Scanner;

public class Adivinha {

    public static int sorteiaNumeroInteiro(int maximo) {
        int x = (int) (Math.random() * (maximo + 1)); // gera número entre 0 e maximo
        return x;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maxNum = 100;
        int pontos = 100;
        int y = sorteiaNumeroInteiro(maxNum);
        boolean acertou = false;
        int tentativas = 0;

        while (!acertou) {
            System.out.println("Tente adivinhar y [0-100]:");
            int numLido = Integer.parseInt(leitor.nextLine());
            tentativas++;

            if (numLido == y) {
                System.out.println("Parabéns! Você acertou.");
                System.out.println("Número de tentativas: " + tentativas);
                System.out.println("Você obteve " + pontos + " pontos.");
                acertou = true;
            } else {
                pontos = pontos - 2;

                if (numLido < y) {
                    System.out.println("Errou! O número sorteado é maior.");
                } else {
                    System.out.println("Errou! O número sorteado é menor.");
                }

                System.out.println("Você perdeu 2 pontos. Pontos atuais: " + pontos);
            }
        }

        leitor.close();
    }
}
git status