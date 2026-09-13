import javax.swing.JOptionPane;
public class NOMEeCIDADE {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String cidade = JOptionPane.showInputDialog("Digite a sua cidade: ");
        System.out.println("Oi " + nome + "!  Que legal saber que você é da cidade de " + cidade);



    }
}
