package persistencia;

import persistencia.conexao.PersistenciaAluno;
import persistencia.conexao.PersistenciaMateria;
import persistencia.conexao.PersistenciaProfessor;
import persistencia.modelo.Aluno;
import persistencia.modelo.Professor;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Scanner;

public class RunBancoDeDados {


    public static void main(String[] args) {

        try {
            menuInicial();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void menuInicial() throws SQLException {
        out("Para cadastrar aluno digite 1 \nPara cadastrar professor digite 2\nPara vincular professor e matéria digite 3\nPara buscar aluno digite 4");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                out("Cadastrando aluno");
                cadastrarAluno();
                break;
            case 2:
                out("Cadastrando professor");
                cadastrarProfessor();
                break;
            case 3:
                out("Vincular professor e matéria");
                vincularProfessorMateria();
                break;
            case 4:
                out("Buscando aluno");
                buscarAluno();
                break;
            default:
                out("Opção inválida");
                break;
        }
    }

    private static void buscarAluno() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        out("Para listar todos  alunos digite 1 \nPara buscar pelo nome digite 2");
        PersistenciaAluno persistenciaAluno = new PersistenciaAluno();
        int opcao = scanner.nextInt();
        ArrayList<String> alunos = null;
        switch (opcao){
            case 1:
                out("Listando todos os alunos");
                alunos = persistenciaAluno.buscarAlunos();
                break;
            case 2:
                scanner.nextLine();
                out("Digite o nome do aluno:");
                String nome = scanner.nextLine();
                alunos = persistenciaAluno.buscarAlunos(nome);
                break;
            default:
                out("Opção inválida");
                break;
        }
        for(String aluno : alunos){
            out(aluno);
        }
        out("Digito o código do aluno que deseja deletar");
        int codigo = scanner.nextInt();
        persistenciaAluno.deletarAluno(codigo);
        //deletarAluno();

    }

    private static void cadastrarProfessor() throws SQLException {

        Professor professor = new Professor();
        PersistenciaProfessor persistenciaProfessor = new PersistenciaProfessor();
        PersistenciaMateria persistenciaMateria = new PersistenciaMateria();
        ArrayList<String> materias = null;
        try {
            materias = persistenciaMateria.buscarMaterias();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);

        out("Digite o nome do professor:");
        String nome = scanner.nextLine();
        professor.setNome(nome);
        for(String materia : materias){
            out(materia);
        }
        out("Digite o código da matéria do professor:");
        professor.setMateria(scanner.nextInt());
        out("Verifique os dados do professor:");
        out("Nome: " + professor.getNome());
        out("Matéria: " + professor.getMateria());
        out("Para confirmar digite S, para corrigir digite N, para voltar ao menu inicial digite V");
        persistenciaProfessor.Salvar(professor);


    }

    public static void cadastrarAluno() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        PersistenciaAluno persistenciaAluno = new PersistenciaAluno();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Aluno aluno = new Aluno();
        // Solicita ao usuário que digite uma entrada
        out("Digite o nome do aluno:");
        aluno.setNome(scanner.nextLine());
        out("Digite a data de nascimento do aluno:");
        Date dataNascimento =  sdf.parse(scanner.nextLine(), new java.text.ParsePosition(0));
        aluno.setDataNascimento(dataNascimento);
        aluno.setDataMatricula(Date.from(Instant.now()));
        out("Verifique os dados do aluno:");
        out("Nome: " + aluno.getNome());
        out("Data de nascimento: " + aluno.getDataNascimento());
        out("Data de matrícula: " + aluno.getDataMatricula());
        out("Para confirmar digite S, para corrigir digite N, para voltar ao menu inicial digite V");
        String confirmacao = scanner.nextLine();
        switch (confirmacao){
            case "S":
                persistenciaAluno.Salvar(aluno);
                break;
            case "N":
                out("Cadastro cancelado");
                cadastrarAluno();
                break;
            default:
                out("Opção inválida");
                menuInicial();
                break;
        }
        menuInicial();
    }
    private static void out(String s) {
        System.out.println(s);
    }
    public static void vincularProfessorMateria() throws SQLException {
        PersistenciaProfessor persistenciaProfessor = new PersistenciaProfessor();
        PersistenciaMateria persistenciaMateria = new PersistenciaMateria();
        ArrayList<String> materias = null;
        ArrayList<String> professores = null;
        try{
            materias = persistenciaMateria.buscarMaterias();
            professores = persistenciaProfessor.buscarProfessor();
            Scanner scanner = new Scanner(System.in);
            out("Selecione o professor:");
            for(String professor : professores){
                out(professor);
            }
            int codigoProfessor = scanner.nextInt();
            out("Selecione a matéria:");
            for(String materia : materias){
                out(materia);
            }
            int codigoMateria = scanner.nextInt();
            persistenciaProfessor.vincularProfessorMateria(codigoProfessor, codigoMateria);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
