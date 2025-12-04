package crud;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CrudSwing {

    // LISTAS PARA ARMAZENAR OS DADOS
    static ArrayList<String> nomes = new ArrayList<>();
    static ArrayList<Integer> idades = new ArrayList<>();
    static ArrayList<Double> notas = new ArrayList<>();

    public static void main(String[] args) {

        // JANELA PRINCIPAL
        JFrame frame = new JFrame("CRUD de Alunos - Swing");
        frame.setSize(450, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // LABELS E CAMPOS
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 100, 25);
        frame.add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(120, 20, 200, 25);
        frame.add(txtNome);

        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(20, 60, 100, 25);
        frame.add(lblIdade);

        JTextField txtIdade = new JTextField();
        txtIdade.setBounds(120, 60, 100, 25);
        frame.add(txtIdade);

        JLabel lblNota = new JLabel("Nota:");
        lblNota.setBounds(20, 100, 100, 25);
        frame.add(lblNota);

        JTextField txtNota = new JTextField();
        txtNota.setBounds(120, 100, 100, 25);
        frame.add(txtNota);

        // ÁREA DE TEXTO PARA LISTAR OS ALUNOS
        JTextArea txtArea = new JTextArea();
        txtArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtArea);
        scroll.setBounds(20, 220, 380, 220);
        frame.add(scroll);

        // ========= BOTÕES =========

        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBounds(20, 150, 120, 30);
        frame.add(btnAdicionar);

        JButton btnListar = new JButton("Listar");
        btnListar.setBounds(160, 150, 120, 30);
        frame.add(btnListar);

        JButton btnAtualizar = new JButton("Atualizar");
        btnAtualizar.setBounds(300, 150, 120, 30);
        frame.add(btnAtualizar);

        JButton btnRemover = new JButton("Remover");
        btnRemover.setBounds(20, 185, 120, 30);
        frame.add(btnRemover);

        // ========= FUNÇÕES =========

        // ADICIONAR
        btnAdicionar.addActionListener(e -> {
            String nome = txtNome.getText();
            int idade = Integer.parseInt(txtIdade.getText());
            double nota = Double.parseDouble(txtNota.getText());

            nomes.add(nome);
            idades.add(idade);
            notas.add(nota);

            JOptionPane.showMessageDialog(frame, "Aluno cadastrado!");

            txtNome.setText("");
            txtIdade.setText("");
            txtNota.setText("");

            atualizarListagem(txtArea);
        });

        // LISTAR
        btnListar.addActionListener(e -> atualizarListagem(txtArea));

        // ATUALIZAR
        btnAtualizar.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Índice do aluno para atualizar:");
            int indice = Integer.parseInt(input);

            String novoNome = JOptionPane.showInputDialog("Novo nome:", nomes.get(indice));
            int novaIdade = Integer.parseInt(JOptionPane.showInputDialog("Nova idade:", idades.get(indice)));
            double novaNota = Double.parseDouble(JOptionPane.showInputDialog("Nova nota:", notas.get(indice)));

            nomes.set(indice, novoNome);
            idades.set(indice, novaIdade);
            notas.set(indice, novaNota);

            JOptionPane.showMessageDialog(frame, "Aluno atualizado!");
            atualizarListagem(txtArea);
        });

        // REMOVER
        btnRemover.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Índice do aluno para remover:");
            int indice = Integer.parseInt(input);

            nomes.remove(indice);
            idades.remove(indice);
            notas.remove(indice);

            JOptionPane.showMessageDialog(frame, "Aluno removido!");
            atualizarListagem(txtArea);
        });

        frame.setVisible(true);
    }

    // MÉTODO PARA ATUALIZAR LISTA NO TEXTAREA
    private static void atualizarListagem(JTextArea txtArea) {
        txtArea.setText("");

        if (nomes.isEmpty()) {
            txtArea.setText("Nenhum aluno cadastrado.");
            return;
        }

        for (int i = 0; i < nomes.size(); i++) {
            txtArea.append(
                    i + " - Nome: " + nomes.get(i)
                            + ", Idade: " + idades.get(i)
                            + ", Nota: " + notas.get(i) + "\n"
            );
        }
    }
}
