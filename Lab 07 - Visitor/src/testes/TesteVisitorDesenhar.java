package testes;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Trapezio;
import entidades.Triangulo;
import interfaces.VisitorIF;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import visitor.VisitorDesenhar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteVisitorDesenhar {
    static VisitorIF visitor;

    static Circulo circulo;
    static Triangulo triangulo;
    static Retangulo retangulo;
    static Trapezio trapezio;

    @BeforeAll
    static void init(){
        visitor = new VisitorDesenhar();

        circulo = new Circulo(5);
        triangulo = new Triangulo(7, 3);
        retangulo = new Retangulo(10, 5);
        trapezio = new Trapezio(5, 8, 4, 3);
    }

    @Test
    void desenhaCirculo() {
        double expected = -1;
        assertEquals(expected, visitor.visitaCirculo(circulo));
    }

    @Test
    void desenhaTriangulo() {
        double expected = -1;
        assertEquals(expected, visitor.visitaTriangulo(triangulo));
    }

    @Test
    void desenhaRetangulo() {
        double expected = -1;
        assertEquals(expected, visitor.visitaRetangulo(retangulo));
    }

    @Test
    void desenhaTrapezio() {
        double expected = -1;
        assertEquals(expected, visitor.visitaTrapezio(trapezio));
    }
}
