package figuras;

public class TrianguloEquilatero extends Triangulo {

    private static TrianguloEquilatero instanciaTrianguloEquilatero;

    private TrianguloEquilatero() {
    }

    public static TrianguloEquilatero getInstancia() {
        if (instanciaTrianguloEquilatero == null) {
            synchronized (TrianguloEquilatero.class) {
                if (instanciaTrianguloEquilatero == null) {
                    instanciaTrianguloEquilatero = new TrianguloEquilatero();
                }

            }
        }
        return instanciaTrianguloEquilatero;
    }

}
