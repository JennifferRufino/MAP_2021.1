package test;

import controleacademico.Disciplina;
import controleacademico.Professor;
import controleacademico.ProfessorControle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ControleProfessorTest {
    Professor professor;
    Disciplina disc, disc1;
    ProfessorControle controle;
    List<Professor> professores;

    @BeforeEach
    public void setUp() throws Exception {
        professor = new Professor("01", "Paulo Cesar");
        disc = new Disciplina("01", "Métodos Avançados de Programação", "Ciência da Computação", "Segunda 9h - 11h/Sexta 11h - 13:00");
        disc1 = new Disciplina("02", "Banco de Dados", "Ciência da Computação", "Terça 7h - 9h/Sexta 7h - 09h");
        professores = new ArrayList<Professor>();
        controle = new ProfessorControle();
    }

    /**
     * Teste se o professor foi cadastrado na disciplina
     */
    @Test
    public void testCadastrarProfessor() {
        assertEquals(true, controle.cadastrarProfessor(professor, disc));
        assertEquals(false, controle.cadastrarProfessor(professor, disc));
        assertEquals(true, controle.cadastrarProfessor(professor, disc1));
        assertEquals(false, controle.cadastrarProfessor(professor, disc1));
    }

    /**
     * Teste da lista de professores
     */
    @Test
    public void testGetProfessores() {
        // Lista vazia
        assertTrue(professores.isEmpty());
        // Adiciona um professor na lista
        professores.add(professor);
        // Lista com um elemento
        assertEquals(1, professores.size());
        assertTrue(professores.contains(professor));
        assertFalse(professores.isEmpty());
    }

}
