import javax.swing.*;

public class IdadeCalculada {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Informe o seu nome completo:", "Dados do Usuário", JOptionPane.QUESTION_MESSAGE);
        String anoDeNascimento = JOptionPane.showInputDialog(null, "Informe o ano em que você nasceu:", "Dados do Usuário", JOptionPane.QUESTION_MESSAGE);

        int ano = Integer.parseInt(anoDeNascimento);

        int idade = 2024 - ano;

        String resultado = String.format("O seu nome é %s e você possui %d anos de idade.", nome, idade);
        JOptionPane.showMessageDialog(null, resultado, "Dados do Usuário", JOptionPane.INFORMATION_MESSAGE);
    }
}
