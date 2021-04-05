package test;

import controleacademico.Disciplina;
import controleacademico.Professor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestProfessor {

    Professor professor;
    Disciplina disc;
    List<Disciplina> disciplinas;

    @BeforeEach
    public void setUp() throws Exception {
        professor = new Professor("P01", "Sabrina Souto");
        disc = new Disciplina("D01", "Paradigmas de programação", "Ciência da Computação",
                "Segunda 7h - 9h/Quarta 9h - 11h");
        disciplinas = new ArrayList<Disciplina>();
    }

    @Test
    public void testGetNome() {
        assertEquals("Sabrina Souto", professor.getNome());
        assertNotEquals("Luciana", professor.getNome());
    }

    @Test
    public void testGetId() {
        assertEquals("P01", professor.getId());
        assertNotEquals("P02", professor.getId());
    }

    @Test
    public void testGetDisciplinas() {
        // Lista vazia
        assertTrue(professor.getDisciplinas().isEmpty());
        // Adiciona um elemento na lista
        professor.getDisciplinas().add(disc);
        // Lista com um elemento
        assertEquals(1, professor.getDisciplinas().size());
        assertTrue(professor.getDisciplinas().contains(disc));
        assertFalse(professor.getDisciplinas().isEmpty());
    }
}
