package persistencia.conexao;

import persistencia.modelo.Professor;

public class PersistenciaProfessor extends ConexaoBancoDeDados{
    public PersistenciaProfessor() {
        super();
    }
    public void Salvar(Professor professor) {
        // Salva o professor no banco de dados
        String query = "INSERT INTO professor ( nome, codigo_2materia) VALUES ( '" + professor.getNome() + "', " + professor.getMateria() + ");";
        try {

            this.connection.createStatement().executeUpdate(query);
            System.out.println("Professor salvo com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
