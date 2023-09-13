package persistencia.modelo;

import java.util.Date;

public class Aluno extends Pessoa{

    Date dataMatricula;
    public Aluno(){

    }
    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

}
