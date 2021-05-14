package interfaces;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Trapezio;
import entidades.Triangulo;

public interface VisitorIF {
    double visitaRetangulo(Retangulo r);
    double visitaTriangulo(Triangulo t);
    double visitaCirculo(Circulo c);
    double visitaTrapezio(Trapezio t);
}
