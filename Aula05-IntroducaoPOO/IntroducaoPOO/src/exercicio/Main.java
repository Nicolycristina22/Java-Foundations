package exercicio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame tela = new JFrame("Cadastro de Aluno");
        tela.setSize(350, 300);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null); // Layout nulo para posicionamento manual

        // Labels e campos
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 80, 20);

        JTextField campoNome = new JTextField();
        campoNome.setBounds(100, 20, 200, 20);

        JLabel lblNota1 = new JLabel("Nota 1:");
        lblNota1.setBounds(20, 60, 80, 20);

        JTextField campoNota1 = new JTextField();
        campoNota1.setBounds(100, 60, 200, 20);

        JLabel lblNota2 = new JLabel("Nota 2:");
        lblNota2.setBounds(20, 100, 80, 20);

        JTextField campoNota2 = new JTextField();
        campoNota2.setBounds(100, 100, 200, 20);

        JButton btnSalvar = new JButton("Calcular Média");
        btnSalvar.setBounds(100, 140, 150, 30);

        JLabel lblResultado = new JLabel("Média: ");
        lblResultado.setBounds(20, 190, 200, 20);

        // Adicionando componentes à tela
        tela.add(lblNome);
        tela.add(campoNome);
        tela.add(lblNota1);
        tela.add(campoNota1);
        tela.add(lblNota2);
        tela.add(campoNota2);
        tela.add(btnSalvar);
        tela.add(lblResultado);

        // Função do botão usando lambda
        btnSalvar.addActionListener(e -> {
            Aluno aluno = new Aluno();

            aluno.nome = campoNome.getText();
            aluno.nota1 = Double.parseDouble(campoNota1.getText());
            aluno.nota2 = Double.parseDouble(campoNota2.getText());

            double media = aluno.calcularMedia();

            lblResultado.setText("Média: " + media);
        });

        tela.setVisible(true);
    }
}
