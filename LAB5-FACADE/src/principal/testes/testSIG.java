package principal.testes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import principal.sig.SIG;
import setor.administrativo.Evento;
import setor.aluno.Aluno;
import setor.financeiro.Conta;
import setor.financeiro.Funcionario;
import setor.professor.Disciplina;
import setor.professor.Professor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class testSIG {
    private static SIG sig;
    private static Evento evento;

    @BeforeAll
    public static void startUp() {
        sig = new SIG();
        evento = new Evento();
    }

    @Test
    public void testAgendarReuniaoDaDiretoria() {
        evento.agendarReuniao(LocalDate.of(2021, 04, 4));
        assertTrue(evento.getReunioes().contains(LocalDate.of(2021, 04, 4)));
    }

    @Test
    public void testAgendarEntrevistaDaDiretoria() {
        evento.agendarEntrevista(LocalDate.of(2021, 04, 12));
        assertTrue(evento.getEntrevistas().contains(LocalDate.of(2021, 04, 12)));
    }

    @Test
    public void testCadastrariDivida() {
        sig.getFinanceiro().cadastrarConta("Emprego", 4000.00, 0.00);
        assertTrue(sig.getFinanceiro().getDividas().contains(new Conta("Emprego", 4000.00, 0.00)));
    }

    @Test
    public void testCadastrarFuncionario() {
        sig.getFinanceiro().cadastrarFuncionario("Sabrina Souto", 3000.00);
        assertTrue(sig.getFinanceiro().getFuncionarios().contains(new Funcionario("Sabrina Souto", 3000.00)));
    }

    @Test
    public void testCadastrarProfessor() {
        sig.getProfessor().cadastrarProfessor("Vitoria Serafim", new ArrayList<>(Arrays.asList(
                new Disciplina("Cálculo I"),
                new Disciplina("Estatística"))), 2.0);
        assertTrue(sig.getProfessor().getProfessores().contains(
                new Professor("Vitoria Serafim", new ArrayList<>(Arrays.asList(
                        new Disciplina("Cálculo I"),
                        new Disciplina("Estatística"))), 2.0)));

    }

    @Test
    public void testCadastrarAluno() {
        sig.getAluno().cadastrarAluno("Jenniffer Rufino", new ArrayList<>(Arrays.asList(new Disciplina("Banco de Dados"), new Disciplina("Redes"))));
        assertTrue(sig.getAluno().getAlunos().contains(new Aluno("Jenniffer Rufino", new ArrayList<>(Arrays.asList(new Disciplina("Banco de Dados"), new Disciplina("Redes"))))));
    }

}
