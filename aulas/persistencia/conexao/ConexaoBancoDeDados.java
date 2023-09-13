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
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    private void conecta() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        if(this.connection == null ){
            this.connection = DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port + "/" + this.database + "?useTimezone=true&serverTimezone=UTC", this.user, this.password);
        }else if(this.connection.isClosed()){
            this.connection = DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port + "/" + this.database + "?useTimezone=true&serverTimezone=UTC", this.user, this.password);
        }
    }
    public Connection getConnection() {
        return connection;
    }

}
