package persistencia.modelo;

import java.util.Date;

public class Aluno {
    String nome;
    Long codigo;
    Date dataNascimento;
    Date dataMatricula;
    public Aluno(){

    }
    public Aluno(String nome, Long codigo, Date dataNascimento, Date dataMatricula) {
        this.nome = nome;
        this.codigo = codigo;
        this.dataNascimento = dataNascimento;
        this.dataMatricula = dataMatricula;
    }

    public String getNome() {
        return nome;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
