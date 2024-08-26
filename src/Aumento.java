import javax.swing.*;

public class Aumento {
    public static void main(String[] args) {
        String salario = JOptionPane.showInputDialog(null, "Informe o seu salário atual (apenas números):", "Aumento de Salário", JOptionPane.QUESTION_MESSAGE);

        double salarioDouble = Double.parseDouble(salario);

        double salarioAumento = (salarioDouble * 15)/100;
        double novoSalario = salarioDouble + salarioAumento;

        String porcentagem = "%";
        String resultado = String.format("O seu salário de R$%.2f recebeu um aumento de 15%s e agora será de R$%.2f", salarioDouble, porcentagem, novoSalario);

        JOptionPane.showMessageDialog(null, resultado, "Aumento de Salário", JOptionPane.INFORMATION_MESSAGE);
    }
}
