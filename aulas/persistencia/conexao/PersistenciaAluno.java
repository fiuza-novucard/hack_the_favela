package persistencia.conexao;

import persistencia.modelo.Aluno;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

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

    public ArrayList<String> buscarAlunos() {
        String consultaTodos = "SELECT * FROM aluno ORDER BY nome ASC";
        return executaConsulta(consultaTodos);
    }
    public ArrayList<String> buscarAlunos(int codigo) {
        String consultaPorCodigo = "SELECT * FROM aluno WHERE codigo = " + codigo + " ORDER BY nome ASC";
        return executaConsulta(consultaPorCodigo);
    }
    public ArrayList<String> buscarAlunos(String nome) {
        String consultaPorNome = "SELECT * FROM aluno WHERE nome LIKE '%" + nome + "%' ORDER BY nome ASC";
        return executaConsulta(consultaPorNome);
    }
    public ArrayList<String> executaConsulta(String consulta){
        ArrayList<String> resultado = new ArrayList<>();
        try {
            ResultSet linhas =  this.connection.createStatement().executeQuery(consulta);

            while (linhas.next()){
                int codigo = linhas.getInt("codigo");
                String materia = linhas.getString("nome");
                String linha = codigo + " - " + materia;
                resultado.add(linha);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultado;
    }

    public void deletarAluno(int codigo) {
        String query = "DELETE FROM aluno WHERE codigo = " + codigo;
        executaDelete(query);
    }
    public void deletarAluno(String nome) {
        String query = "DELETE FROM aluno WHERE nome LIKE '%" + nome + "%'";
        executaDelete(query);
    }
    public void executaDelete(String consultaDeDelete){
        try {
            this.connection.createStatement().executeUpdate(consultaDeDelete);
            System.out.println("Aluno deletado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarAluno(int codigo, String novoNome) {
        String query = "UPDATE aluno SET nome = '" + novoNome + "' WHERE codigo = " + codigo;
        try {
            System.out.println("Aluno editado com sucesso! "+query);
            this.connection.createStatement().executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
