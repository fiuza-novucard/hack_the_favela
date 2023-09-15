package persistencia.conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class PersistenciaMateria extends ConexaoBancoDeDados{
    Connection connection;
public PersistenciaMateria() throws SQLException {
    this.connection = ConexaoBancoDeDados.getInstance().getConnection();
}
    public ArrayList<String> buscarMaterias() throws SQLException {
        String query = "SELECT * FROM materia";
        ArrayList<String> resultado = new ArrayList<>();
        try {
            ResultSet linhas =  this.connection.createStatement().executeQuery(query);

            while (linhas.next()){
                int codigo = linhas.getInt("codigo");
                String materia = linhas.getString("materia");
                String linha = codigo + " - " + materia;
                resultado.add(linha);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultado;
    }

}
