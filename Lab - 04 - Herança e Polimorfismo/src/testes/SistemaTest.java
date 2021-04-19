package testes;

import filme.Filme;
import funcionarios.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sistema.ControleSistema;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SistemaTest {
    ControleSistema controle;
    Filme filme;
    Funcionario ator, diretor, camera, roteirista;

    @BeforeEach
    public void setUp() {
        controle = new ControleSistema();
        ator = new Ator("Marco Pigossi");
        diretor = new Diretor("Denis Carvalho");
        camera = new Camera("Felipe Prior");
        roteirista = new Roteirista("Silvio de Abreu");
        filme = new Filme("Bacurau", 2019, "132 minutos", "Drama", "1 - Bichos da noite / 2 - Não Identificado / 3 - Requiém para Matraga", ator, diretor, camera, roteirista);
    }

    @Test
    public void testCadastrarFuncionario() {
        assertTrue(controle.cadastrarFuncionario(filme, ator));
        assertTrue(controle.cadastrarFuncionario(filme, diretor));
        assertTrue(controle.cadastrarFuncionario(filme, camera));
        assertTrue(controle.cadastrarFuncionario(filme, roteirista));
    }

    @Test
    public void testFilmografia() {
        controle.cadastrarFuncionario(filme, ator);
        controle.cadastrarFuncionario(filme, diretor);
        controle.cadastrarFuncionario(filme, camera);
        controle.cadastrarFuncionario(filme, roteirista);
        assertEquals("Ator em: Bacurau", controle.filmografia("Marco Pigossi"));
        assertEquals("Diretor em: Bacurau", controle.filmografia("Denis Carvalho"));
        assertEquals("Câmera em: Bacurau", controle.filmografia("Felipe Prior"));
        assertEquals("Roteirista em: Bacurau", controle.filmografia("Silvio de Abreu"));
    }
}
