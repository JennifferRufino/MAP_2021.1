package main;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Trapezio;
import entidades.Triangulo;
import interfaces.ElementoConcretoIF;
import interfaces.VisitorIF;
import visitor.VisitorCalculaArea;
import visitor.VisitorCalcularPerimetro;
import visitor.VisitorDesenhar;
import visitor.VisitorMaximizar;

public class Main {

    public static void main(String[] args) {

        VisitorIF visitorCA = new VisitorCalculaArea();
        VisitorIF visitorCP = new VisitorCalcularPerimetro();
        VisitorIF visitorD  = new VisitorDesenhar();
        VisitorIF visitorMM = new VisitorMaximizar();

        ElementoConcretoIF circulo = new Circulo(5);
        ElementoConcretoIF triangulo = new Triangulo(7, 3);
        ElementoConcretoIF retangulo = new Retangulo(10, 5);
        ElementoConcretoIF trapezio = new Trapezio(5, 8, 4, 3);

        VisitorIF[] visitors = new VisitorIF[] {visitorCA, visitorCP, visitorD, visitorMM};

        for(VisitorIF visitor : visitors) {
            System.out.println(visitor.getClass().getName());
            System.out.print("Circulo  : ");
            circulo.aceitaVisita(visitor);
            System.out.print("Triângulo: ");
            triangulo.aceitaVisita(visitor);
            System.out.print("Retângulo: ");
            retangulo.aceitaVisita(visitor);
            System.out.print("Trapézio : ");
            trapezio.aceitaVisita(visitor);
            System.out.println();
        }
    }
}
