package persistencia;

import persistencia.conexao.PersistenciaAluno;
import persistencia.modelo.Aluno;


import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Scanner;

public class RunBancoDeDados {

    public static void main(String[] args) {
        PersistenciaAluno persistenciaAluno = new PersistenciaAluno();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        // Solicita ao usuário que digite uma entrada
        System.out.println("Digite o nome do aluno:");
        aluno.setNome(scanner.nextLine());
        System.out.println("Digite a data de nascimento do aluno:");
        Date dataNascimento =  sdf.parse(scanner.nextLine(), new java.text.ParsePosition(0));
        aluno.setDataNascimento(dataNascimento);
        aluno.setDataMatricula(Date.from(Instant.now()));
        persistenciaAluno.Salvar(aluno);


        // Exibe a entrada do usuário

    }
}
