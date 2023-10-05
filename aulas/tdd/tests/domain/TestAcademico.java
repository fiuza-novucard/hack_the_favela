package tdd.tests.domain;

import com.mysql.cj.x.protobuf.MysqlxExpect;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import tdd.domain.Academico;

import java.io.IOException;

import static org.junit.Assert.*;

public class TestAcademico extends JUnitCore {

    Academico academico;

    @Before
    public void setUpClass() throws IOException {
        System.out.println("Iniciando os testes da classe Academico");
        academico = new Academico();
    }

    @Test(expected =  IllegalArgumentException.class)
    public void testReprovacaoPorFalta() {

        boolean alunoAprovado = academico.aprovadoNaFrequencia(70);
        assertTrue(alunoAprovado);
        boolean alunoReprovado = academico.aprovadoNaFrequencia(69);
        assertFalse(alunoReprovado);
        academico.aprovadoNaFrequencia(-1);
        academico.aprovadoNaFrequencia(101);
    }

    @Test(expected =  IllegalArgumentException.class)
    public void statusAprovacao(){

        String alunoAprovado = academico.pegaStatusPorNota(70);
        assertEquals("Aprovado", alunoAprovado);
        String alunoReprovado = academico.pegaStatusPorNota(69);
        assertNotEquals("Aprovado", alunoReprovado);
        academico.pegaStatusPorNota(-1);
        academico.pegaStatusPorNota(101);
    }

    @After
    public void tearDownClass() throws IOException {
        System.out.println("Finalizando os testes da classe Academico");
    }

}
