package testes;

import figuras.Quadrado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadradoTest {
    Quadrado quadrado1;
    Quadrado quadrado2;

    @BeforeEach
    public void setUp() throws Exception {
        quadrado1 = new Quadrado(4);
        quadrado2 = new Quadrado(6);
    }

    @Test
    public void testQuadrado() {

        assertNotNull(quadrado1);
        assertNotNull(quadrado2);

        assertEquals("Quadrado criado com lados no valor de: 4.0", quadrado1.criarQuadrado());
        assertEquals("Quadrado criado com lados no valor de: 6.0", quadrado2.criarQuadrado());

        assertNotEquals(quadrado1, quadrado2);
    }
}
