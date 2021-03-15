package test;

import static org.junit.jupiter.api.Assertions.*;

import example.TriangleException;
import example.TriangleKind;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import example.Triangulo;

public class TriangleTest {

    @Test
    public void equilateralTriangleHaveEqualSides() throws Exception {
        Triangulo triangle = new Triangulo(2, 2, 2);
        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind());
    }

    @Test
    public void isoscelesTriangleTwoHaveEqualSides() throws Exception {
        Triangulo triangle = new Triangulo(1, 2, 2);
        assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
    }

    @Test
    public void scaleneTriangleHaveDifferentSides() throws Exception {
        Triangulo triangle = new Triangulo(5, 2, 4);
        assertEquals(TriangleKind.SCALENE, triangle.getKind());
    }
    @Test
    public void invalidSide() throws Exception {
        assertThrows(TriangleException.class, () -> new Triangulo(1,2,3));
        assertThrows(TriangleException.class, () -> new Triangulo(-1,-2,-3));
        assertThrows(TriangleException.class, () -> new Triangulo(0,0,0));
    }
}