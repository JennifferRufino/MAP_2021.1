package figuras;

public class TrianguloIsosceles extends Triangulo {

    private static TrianguloIsosceles instanciaTrianguloIsosceles;

    private TrianguloIsosceles() {
    }

    public static TrianguloIsosceles getInstancia() {
        if (instanciaTrianguloIsosceles == null) {
            synchronized (TrianguloIsosceles.class) {
                if (instanciaTrianguloIsosceles == null) {
                    instanciaTrianguloIsosceles = new TrianguloIsosceles();
                }
            }
        }
        return instanciaTrianguloIsosceles;
    }

}
