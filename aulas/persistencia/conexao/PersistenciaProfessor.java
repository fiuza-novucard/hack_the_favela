package persistencia.conexao;

import persistencia.modelo.Professor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersistenciaProfessor{
    Connection connection;
    public PersistenciaProfessor() throws SQLException {
        this.connection = ConexaoBancoDeDados.getInstance().getConnection();
    }
    public void Salvar(Professor professor) {
        // Salva o professor no banco de dados
        String query = "INSERT INTO professor ( nome) VALUES ( '" + professor.getNome() + "');";
        try {
            Statement stmt = this.connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = stmt.getGeneratedKeys();
            if (resultSet.next()) {
                int lastInsertId = resultSet.getInt(1);
                String query2 = "INSERT INTO professor_materia ( codigo_professor, codigo_materia) VALUES ( '" + lastInsertId + "', '" + professor.getMateria() + "');";
                stmt.executeUpdate(query2);
            }


            System.out.println("Professor salvo com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> buscarProfessor() throws SQLException {
        String query = "SELECT * FROM professor";
        ArrayList<String> resultado = new ArrayList<>();
        try {
            ResultSet linhas =  this.connection.createStatement().executeQuery(query);

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
    public void vincularProfessorMateria(int codigoProfessor, int codigoMateria) throws SQLException {
        String query = "INSERT INTO professor_materia ( codigo_professor, codigo_materia) VALUES ( '" + codigoProfessor + "', '" + codigoMateria + "');";
        try {
            this.connection.createStatement().executeUpdate(query);
            System.out.println("Professor vinculado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
