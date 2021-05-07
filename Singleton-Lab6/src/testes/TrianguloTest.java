package testes;

import figuras.TrianguloEquilatero;
import figuras.TrianguloIsosceles;
import figuras.TrianguloRetangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TrianguloTest {
    TrianguloEquilatero equilatero1, equilatero2;
    TrianguloIsosceles isosceles1, isosceles2;
    TrianguloRetangulo retangulo1, retangulo2;

    @BeforeEach
    public void setUp() throws Exception {
        equilatero1 = TrianguloEquilatero.getInstancia();
        equilatero2 = TrianguloEquilatero.getInstancia();
        isosceles1 = TrianguloIsosceles.getInstancia();
        isosceles2 = TrianguloIsosceles.getInstancia();
        retangulo1 = TrianguloRetangulo.getInstancia();
        retangulo2 = TrianguloRetangulo.getInstancia();
    }

    @Test
    public void testTrianguloEquilatero() {

        assertNotNull(equilatero1);
        assertNotNull(equilatero2);

        assertEquals("Triangulo criado com lados: 4.0, 4.0, 4.0", equilatero1.criarTriangulo(4, 4, 4));
        assertEquals("Triangulo criado com lados: 6.0, 6.0, 6.0", equilatero2.criarTriangulo(6, 6, 6));

        assertEquals(equilatero1, equilatero2);
    }


    @Test
    public void TrianguloIsosceles() {

        assertNotNull(isosceles1);
        assertNotNull(isosceles2);

        assertEquals("Triangulo criado com lados: 2.0, 2.0, 4.0", isosceles1.criarTriangulo(2, 2, 4));
        assertEquals("Triangulo criado com lados: 4.0, 4.0, 6.0", isosceles2.criarTriangulo(4, 4, 6));

        assertEquals(isosceles1, isosceles2);
    }


    @Test
    public void testTrianguloRetangulo() {
        assertNotNull(retangulo1);
        assertNotNull(retangulo2);

        assertEquals("Triangulo criado com lados: 20.0, 40.0, 90.0", retangulo1.criarTriangulo(20, 40, 90));
        assertEquals("Triangulo criado com lados: 15.0, 30.0, 90.0", retangulo2.criarTriangulo(15, 30, 90));

        assertEquals(retangulo1, retangulo2);
    }
}
