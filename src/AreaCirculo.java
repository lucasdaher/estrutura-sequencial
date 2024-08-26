import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {
        String raioStr = JOptionPane.showInputDialog("Digite o raio do círculo:");

        double raio = Double.parseDouble(raioStr);

        double area = Math.PI * Math.pow(raio, 2);

        String mensagem = String.format("A área do círculo é: %.4f", area);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
