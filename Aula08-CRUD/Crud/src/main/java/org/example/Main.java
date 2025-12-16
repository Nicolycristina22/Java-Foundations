package org.example;


import org.example.entidades.Aluno;
import org.example.entidades.GerenciarAlunos;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();

       Aluno aluno1 = new Aluno("diego", 10,10);
        Scanner sc = new Scanner(System.in);
        int opcao;

        while(true){
            System.out.println("menu de opcoes");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - listar Alunos");
            System.out.println("3 - atualizar Aluno");
            System.out.println("4 - excluir Aluno");
            System.out.println("5 - sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Digite o nome do aluno:");
                    String nome = sc.nextLine();
                    System.out.println("Digite a primeira nota:");
                    double nota = sc.nextDouble();
                    System.out.println("Digite a segunda nota:");
                    double nota2 = sc.nextDouble();
                    Aluno novoAluno = new Aluno(nome, nota, nota2);
                    gerenciarAlunos.cadastrarAluno(novoAluno);
                    break;
                case 2:
                    gerenciarAlunos.listarAlunos();
                    break;
                case 3:
                    gerenciarAlunos.listarAlunos();
                    System.out.println("Digite o ID do aluno a ser atualizado:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o novo nome do aluno:");
                    nome = sc.nextLine();

                    System.out.println("Digite a nova primeira nota:");
                    nota = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite a nova segunda nota:");
                    nota2 = sc.nextDouble();
                    sc.nextLine();

                    gerenciarAlunos.alterarAluno(id, nome, nota, nota2);
                    break;
                case 4:
                    gerenciarAlunos.listarAlunos();
                    System.out.print("Digite o ID do aluno a ser excluido:");
                     id = sc.nextInt();
                    gerenciarAlunos.excluirAluno(id);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }

        }


    }

}
