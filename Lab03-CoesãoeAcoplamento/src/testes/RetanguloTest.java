package testes;

import figurasGeometricas.Retangulo;
import figurasGeometricas.ValorInvalidoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {
    Retangulo retangulo = null;

    @BeforeEach
    void criarRetangulo() throws ValorInvalidoException {
        retangulo = new Retangulo(4,3);
    }

    @Test
    void testInicializacao(){
        try {
            retangulo = new Retangulo(10, 5);
        }catch(ValorInvalidoException e) {
            fail("Esse não entra: "+e.getMessage());
        }
    }

    @Test
    void testErroInicializacao() {
        assertThrows(ValorInvalidoException.class, () -> {
            retangulo = new Retangulo(-2, 1);
        });
        assertThrows(ValorInvalidoException.class, () -> {
            retangulo = new Retangulo(1, -2);
        });
        assertThrows(ValorInvalidoException.class, () -> {
            retangulo = new Retangulo(0, 0);
        });
    }

    @Test
    void calcularArea() throws ValorInvalidoException {
        int expected = 12;
        assertEquals(expected, retangulo.calcularArea());
        retangulo.setAltura(10);
        retangulo.setLargura(5);
        expected = 50;
        assertEquals(expected, retangulo.calcularArea());
    }

    @Test
    void calcularPerimetro() throws ValorInvalidoException {
        int expected = 14;
        assertEquals(expected, retangulo.calcularPerimetro());
        retangulo.setAltura(10);
        retangulo.setLargura(5);
        expected = 30;
        assertEquals(expected, retangulo.calcularPerimetro());
    }

    @Test
    void testToString() {
        String expected = "O retângulo tem altura de tamanho = 4, e largura de tamanho = 3";
        assertEquals(expected, retangulo.toString());
    }
}
