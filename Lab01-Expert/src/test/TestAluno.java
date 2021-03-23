package test;

import controleacademico.Aluno;
import controleacademico.Disciplina;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAluno {

    Aluno aluno;
    Disciplina disc;
    List<Disciplina> disciplinas;

    @BeforeEach
    public void setUp() throws Exception {
        aluno = new Aluno("1703", "Jenniffer Rufino");
        disc = new Disciplina("01", "Banco de dados", "Ciência da Computação", "Terça 7h - 9h/Sexta 7h - 09h");
        disciplinas = new ArrayList<Disciplina>();
    }

    @Test
    public void testGetNome() {
        assertEquals("Jenniffer Rufino", aluno.getNome());
        assertNotEquals("Gilberto", aluno.getNome());
    }

    @Test
    public void testGetId() {
        assertEquals("1703", aluno.getId());
        assertNotEquals("2222", aluno.getId());
    }

    @Test
    public void testGetDisciplinas() {
        // Verifica se a lista é vazia
        assertTrue(aluno.getDisciplinas().isEmpty());
        // Adiciona um elemento na lista
        aluno.getDisciplinas().add(disc);
        // Testa se existe um elemento na lista
        assertEquals(1, aluno.getDisciplinas().size());
        assertTrue(aluno.getDisciplinas().contains(disc));
        //Verifica se a lista é vazia
        assertFalse(aluno.getDisciplinas().isEmpty());
    }

}
