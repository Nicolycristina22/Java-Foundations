package org.example;


import org.example.entidades.Aluno;
import org.example.entidades.GerenciarAlunos;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();

       Aluno aluno1 = new Aluno("diego", 10,10);

       //gerenciarAlunos.cadastrarAluno(aluno1);
       gerenciarAlunos.excluirAluno(1);
    }

}
