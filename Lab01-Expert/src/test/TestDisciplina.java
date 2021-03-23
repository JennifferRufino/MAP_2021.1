package test;

import controleacademico.Disciplina;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestDisciplina {
    Disciplina disciplina, disciplina1;

    @BeforeEach
    public void setUp() throws Exception {
        disciplina = new Disciplina( "D01", "Paradigmas de programação", "Ciência da Computação", "Segunda 11h - 13h/Quarta 09h - 11h");
        disciplina1 = new Disciplina("D02", "Métodos Avançados de Programação", "Ciência da Computação", "Segunda 9h - 11h/Sexta 11h - 13h");
    }

    @Test
    public void testGetCodigo() {
        assertEquals("D01", disciplina.getCodigo());
        assertEquals("D02", disciplina1.getCodigo());
        assertNotEquals("D01", disciplina1.getCodigo());
        assertNotEquals("D02", disciplina.getCodigo());
    }

    @Test
    public void testGetNome() {
        assertEquals("Paradigmas de programação", disciplina.getNome());
        assertEquals("Métodos Avançados de Programação", disciplina1.getNome());
        assertNotEquals("Métodos Avançados de Programação", disciplina.getNome());
        assertNotEquals("Paradigmas de programação", disciplina1.getNome());
    }

    @Test
    public void testGetCurso() {
        assertEquals("Ciência da Computação", disciplina.getCurso());
        assertEquals("Ciência da Computação", disciplina1.getCurso());
        assertNotEquals("Medicina veterinária", disciplina.getCurso());
        assertNotEquals("Medicina veterinária", disciplina1.getCurso());
    }

    @Test
    public void testGetHorario() {
        assertEquals("Segunda 11h - 13h/Quarta 09h - 11h", disciplina.getHorario());
        assertEquals("Segunda 9h - 11h/Sexta 11h - 13h", disciplina1.getHorario());
        assertNotEquals("Segunda 11h", disciplina.getHorario());
        assertNotEquals("Quarta 7h", disciplina1.getHorario());
    }

}
