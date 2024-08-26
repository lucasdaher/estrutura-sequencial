import javax.swing.*;

public class Desconto {
    public static void main(String[] args) {

        String nomeProduto = JOptionPane.showInputDialog(null, "Informe o nome do produto:", "Desconto em Produto", JOptionPane.QUESTION_MESSAGE);
        String valorOriginal = JOptionPane.showInputDialog(null, "Informe o valor do produto:", "Desconto em Produto", JOptionPane.QUESTION_MESSAGE);
        String desconto = JOptionPane.showInputDialog(null, "Informe o desconto (em %) que será aplicado ao produto:", "Desconto em Produto", JOptionPane.QUESTION_MESSAGE);

        // Verificação de erro caso digite a porcentagem incorreta.
        while (Integer.parseInt(desconto) < 0 || Integer.parseInt(desconto) >= 100) {
            desconto = JOptionPane.showInputDialog(null, "Você informou uma porcentagem incorreta! Ela deve ser maior que 0 e menor ou igual a 100.\n\nInforme o desconto (em %) que será aplicado ao produto:", "Desconto em Produto", JOptionPane.QUESTION_MESSAGE);
        }

        int porcentagemDesconto = Integer.parseInt(desconto);

        double valorDesconto = (Double.parseDouble(valorOriginal) * porcentagemDesconto) / 100;
        double valorFinal = Double.parseDouble(valorOriginal) - valorDesconto;

        String porcentagem = "%";
        String resultado = String.format("O produto %s recebeu um desconto de %d%s e o seu valor de R$%.2f foi alterado para R$%.2f", nomeProduto, porcentagemDesconto, porcentagem, Double.parseDouble(valorOriginal), valorFinal);

        JOptionPane.showMessageDialog(null, resultado, "Desconto em Produto", JOptionPane.INFORMATION_MESSAGE);

    }
}
