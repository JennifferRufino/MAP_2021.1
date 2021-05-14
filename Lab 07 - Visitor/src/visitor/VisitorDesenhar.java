package visitor;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Trapezio;
import entidades.Triangulo;
import interfaces.VisitorIF;

public class VisitorDesenhar implements VisitorIF {

    @Override
    public double visitaRetangulo(Retangulo r) {
        System.out.println("Retângulo desenhado!");
        return -1;
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        System.out.println("Triângulo desenhado!");
        return -1;
    }

    @Override
    public double visitaCirculo(Circulo c) {
        System.out.println("Circulo desenhado!");
        return -1;
    }

    @Override
    public double visitaTrapezio(Trapezio c) {
        System.out.println("Trapézio desenhado!");
        return -1;
    }
}