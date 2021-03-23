package test;

import controleacademico.Aluno;
import controleacademico.AlunoControle;
import controleacademico.Disciplina;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ControleAlunoTest {
    Disciplina disc;
    Aluno aluno, aluno1;
    AlunoControle controle;
    List<Aluno> alunos;

    @BeforeEach
    public void setUp() throws Exception {
        disc = new Disciplina("01", "Matemática", "Computação", "Terça 7h - 9h/Quinta 9h - 11h");
        aluno = new Aluno("4321", "Ana Paula");
        aluno1 = new Aluno("5678", "Aline Lins");
        alunos = new ArrayList<Aluno>();
        controle = new AlunoControle();
    }

    /**
     * Verifica se o aluno foi cadastrado na disciplina
     */
    @Test
    public void testCadastrarAluno() {
        assertEquals(true, controle.cadastrarAluno(aluno, disc));
        assertEquals(false, controle.cadastrarAluno(aluno, disc));
        assertEquals(true, controle.cadastrarAluno(aluno1, disc));
    }

    /**
     * Teste da quantidade de alunos de uma disciplina
     */
    @Test
    public void testQuantidadeAlunos() {
        controle.cadastrarAluno(aluno, disc);
        controle.cadastrarAluno(aluno1, disc);
        assertEquals(2, controle.quantidadeAlunos(disc));
    }

    /**
     * Teste da lista de alunos
     */
    @Test
    public void testGetAlunos() {
        // Lista vazia
        assertTrue(alunos.isEmpty());
        alunos.add(aluno);
        alunos.add(aluno1);
        // Lista com dois elementos
        assertEquals(2, alunos.size());
        assertTrue(alunos.contains(aluno1));
        assertFalse(alunos.isEmpty());
    }
}
