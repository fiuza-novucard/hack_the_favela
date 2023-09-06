package persistencia.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDeDados {
    String host = "localhost";
    String database = "aula";
    String user = "root";
    String password = "123456";

    int port = 3306;

    Connection connection;
    // Conecta ao banco de dados MySQL
    public ConexaoBancoDeDados(){
        try {
            conecta();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void conecta() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database , user, password);
    }
    public Connection getConnection() {
        return connection;
    }

}
