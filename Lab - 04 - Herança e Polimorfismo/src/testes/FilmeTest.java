package testes;

import filme.Filme;
import funcionarios.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FilmeTest {
    Filme filme;
    Funcionario ator, diretor, camera, roteirista;

    @BeforeEach
    public void setUp() {
        ator = new Ator("Marco Pigossi");
        diretor = new Diretor("Denis Carvalho");
        camera = new Camera("Felipe Prior");
        roteirista = new Roteirista("Silvio de Abreu");
        filme = new Filme("Bacurau", 2019, "132 minutos", "Drama", "1 - Bichos da noite / 2 - Não Identificado / 3 - Requiém para Matraga", ator, diretor, camera, roteirista);
    }

    @Test
    public void testAtorFuncao() {
        assertEquals("Marco Pigossi", filme.getAtor().getNome());
        assertEquals("Denis Carvalho", filme.getDiretor().getNome());
        assertEquals("Felipe Prior", filme.getCamera().getNome());
        assertEquals("Silvio de Abreu", filme.getRoteirista().getNome());
    }

    @Test
    public void testNome() {
        assertEquals("Bacurau", filme.getNome());
        assertNotEquals("Aquarius", filme.getNome());
    }

    @Test
    public void testAno() {
        assertEquals(2019, filme.getAno());
        assertNotEquals(2012, filme.getNome());
    }

    @Test
    public void testDuracao() {
        assertEquals("132 minutos", filme.getDuracao());
        assertNotEquals("110 minutos", filme.getDuracao());
    }

    @Test
    public void testTrilhaSonora() {
        assertEquals("1 - Bichos da noite / 2 - Não Identificado / 3 - Requiém para Matraga", filme.getTrilhasonora());
        assertNotEquals("1 - Dia branco", filme.getTrilhasonora());
    }

    @Test
    public void testFuncao() {
        assertEquals("Ator", filme.getAtor().getFuncao());
        assertEquals("Diretor", filme.getDiretor().getFuncao());
        assertEquals("Câmera", filme.getCamera().getFuncao());
        assertEquals("Roteirista", filme.getRoteirista().getFuncao());
    }

}
