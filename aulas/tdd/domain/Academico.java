package tdd.domain;

public class Academico {


    public boolean aprovadoNaFrequencia(long presencaAluno) throws IllegalArgumentException {
        if (presencaAluno < 0 || presencaAluno > 100) {
            throw new IllegalArgumentException("Presença não pode ser negativa");
        }
        if (presencaAluno >= 70) {
            return true;
        }else{
            return false;
        }

    }

    public String pegaStatusPorNota(long notaMateriaAluno) throws IllegalArgumentException{
        if(notaMateriaAluno < 0 || notaMateriaAluno > 100){
            throw new IllegalArgumentException("verifique a nota do contrário o professo e/ou o aluno sao muito burros");
        }
        if (notaMateriaAluno >= 70) {
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
}
