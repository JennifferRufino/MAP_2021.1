package testes;

import figuras.Circulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTest {
    Circulo circulo1;
    Circulo circulo2;

    @BeforeEach
    public void setUp() throws Exception {
        circulo1 = Circulo.getInstancia();
        circulo2 = Circulo.getInstancia();
    }

    @Test
    public void testCirculo() {
        assertNotNull(circulo1);
        assertNotNull(circulo2);

        assertEquals("Circulo criado com raio: 4.0", circulo1.criarCirculo(4));
        assertEquals("Circulo criado com raio: 8.0", circulo2.criarCirculo(8));

        assertEquals(circulo1, circulo2);

    }
}
