package figuras;

public class TrianguloRetangulo extends Triangulo {
    private static TrianguloRetangulo instanciaTrianguloRetangulo;

    private TrianguloRetangulo() {
    }

    public static TrianguloRetangulo getInstancia() {
        if (instanciaTrianguloRetangulo == null) {
            synchronized (TrianguloRetangulo.class) {
                if (instanciaTrianguloRetangulo == null) {
                    instanciaTrianguloRetangulo = new TrianguloRetangulo();
                }
            }
        }
        return instanciaTrianguloRetangulo;
    }
}
