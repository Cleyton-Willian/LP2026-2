import javax.swing.JOptionPane;
public class IMC {
    public static void main(String [] args) {
        String pesoEmString = JOptionPane.showInputDialog("Digite o seu peso");
        double pesoEmDouble = Double.parseDouble(pesoEmString);
        String alturaEmString = JOptionPane.showInputDialog("Digite sua altura");
        double alturaEmDouble = Double.parseDouble(alturaEmString);
        double imc = pesoEmDouble/ (alturaEmDouble*alturaEmDouble);
        JOptionPane.showMessageDialog(null, "Seu IMC é de: " + imc);

    }
}
