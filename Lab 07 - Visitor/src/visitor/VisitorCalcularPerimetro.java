package visitor;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Trapezio;
import entidades.Triangulo;
import interfaces.VisitorIF;

public class VisitorCalcularPerimetro implements VisitorIF {

    @Override
    public double visitaRetangulo(Retangulo r) {
        return 2 * (r.getAltura() + r.getBase());
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        double hip = Math.sqrt(Math.pow(t.getBase(), 2) + Math.pow(t.getAltura(), 2));
        return t.getBase() + t.getAltura() + hip;
    }

    @Override
    public double visitaCirculo(Circulo c) {
        return 2 * Math.PI * c.getRaio();
    }

    @Override
    public double visitaTrapezio(Trapezio t) {
        return t.getBaseMaior() + t.getBaseMenor() + t.getTamLados() * 2;
    }
}

