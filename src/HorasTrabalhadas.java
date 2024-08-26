import javax.swing.*;

public class HorasTrabalhadas {
    public static void main(String[] args) {
        String horasTrabalhadas = JOptionPane.showInputDialog(null, "Informe a quantidade de horas que você trabalha:"
                , "Calculadora de Salário" , JOptionPane.QUESTION_MESSAGE);

        int horas = Integer.parseInt(horasTrabalhadas);

        String valorHora = JOptionPane.showInputDialog(null, "Informe o valor recebido por hora trabalhada:"
                , "Calculadora de Salário" , JOptionPane.QUESTION_MESSAGE);

        double valor = Double.parseDouble(valorHora);

        String resultado = String.format("O salário deste funcionário é de:\nR$%.2f", (double) valor * horas);

        JOptionPane.showMessageDialog(null, resultado, "Calculadora de Salário", JOptionPane.PLAIN_MESSAGE);
    }
}
