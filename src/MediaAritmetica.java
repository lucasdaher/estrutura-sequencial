import javax.swing.*;

public class MediaAritmetica {

    public static void main(String[] args) {
        String primeiroValor = JOptionPane.showInputDialog(null, "Digite o primeiro valor:", "Média Artimética", JOptionPane.QUESTION_MESSAGE);
        String segundoValor = JOptionPane.showInputDialog(null, "Digite o segundo valor:", "Média Artimética", JOptionPane.QUESTION_MESSAGE);
        String terceiroValor = JOptionPane.showInputDialog(null, "Digite o terceiro valor:", "Média Artimética", JOptionPane.QUESTION_MESSAGE);
        String quartoValor = JOptionPane.showInputDialog(null, "Digite o quarto valor:", "Média Artimética", JOptionPane.QUESTION_MESSAGE);
        String quintoValor = JOptionPane.showInputDialog(null, "Digite o quinto valor:", "Média Artimética", JOptionPane.QUESTION_MESSAGE);

        double primeiroValorDouble = Double.parseDouble(primeiroValor);
        double segundoValorDouble = Double.parseDouble(segundoValor);
        double terceiroValorDouble = Double.parseDouble(terceiroValor);
        double quartoValorDouble = Double.parseDouble(quartoValor);
        double quintoValorDouble = Double.parseDouble(quintoValor);

        double media = (primeiroValorDouble + segundoValorDouble + terceiroValorDouble + quartoValorDouble + quintoValorDouble) / 5;

        String resultado = String.format("Números informados pelo usuário:\n %.2f, %.2f, %.2f, %.2f, %.2f \n\nResultado da média aritmética:\n %.2f", primeiroValorDouble, segundoValorDouble, terceiroValorDouble, quartoValorDouble, quintoValorDouble, media);
        JOptionPane.showMessageDialog(null, resultado, "Resultado da média aritmética", JOptionPane.INFORMATION_MESSAGE);
    }
}
