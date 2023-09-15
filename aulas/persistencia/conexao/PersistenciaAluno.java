package persistencia.conexao;

import persistencia.modelo.Aluno;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class PersistenciaAluno extends ConexaoBancoDeDados{
    Connection connection;
    public PersistenciaAluno() throws SQLException {
        this.connection = ConexaoBancoDeDados.getInstance().getConnection();
    }
    public void Salvar(Aluno aluno) {
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         String dataNascimento = sdf.format(aluno.getDataNascimento());
         String dataMatricula = sdf.format(aluno.getDataMatricula());
        // Salva o aluno no banco de dados
        String query = "INSERT INTO aluno ( nome, data_nascimento, data_matricula) VALUES ( '" + aluno.getNome() + "', '" + dataNascimento + "', '" + dataMatricula + "');";
        try {
            this.connection.createStatement().executeUpdate(query);
            System.out.println("Aluno salvo com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void buscarAlunos() {
    }
}
