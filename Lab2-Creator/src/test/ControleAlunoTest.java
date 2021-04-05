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
        aluno = new Aluno("1234", "Suzyanne Letycia");
        aluno1 = new Aluno("4321", "Carla Diaz");
        alunos = new ArrayList<Aluno>();
        controle = new AlunoControle();
    }

    /**
     * Verifica se o aluno foi cadastrado na disciplina
     */
    @Test
    public void testCadastrarAluno() {
        assertEquals(true, controle.cadastrarAluno("1234", "Suzyanne Letycia", "01", "Banco de Dados", "Computação", "Terça 7h - 9h/Quinta 9h - 11h"));
        assertEquals(true, controle.cadastrarAluno("5678", "Carla Diaz", "01", "Banco de Dados", "Computação", "Terça 7h - 9h/Quinta 9h - 11h"));
    }

    /**
     * Teste da quantidade de alunos de uma disciplina
     */
    @Test
    public void testQuantidadeAlunos() {
        controle.cadastrarAluno("1234", "Suzyanne Letycia", "01", "Banco de Dados", "Computação", "Terça 7h - 9h/Quinta 9h - 11h");
        controle.cadastrarAluno("4321", "Carla Diaz", "01", "Banco de Dados", "Computação", "Terça 7h - 9h/Quinta 9h - 11h");
        assertEquals(2, controle.quantidadeAlunos("Banco de Dados"));
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
