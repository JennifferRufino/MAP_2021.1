package figuras;

public class Circulo {

    private static Circulo instanciaCirculo;

    private Circulo() {
    }

    public static Circulo getInstancia() {
        if (instanciaCirculo == null) {
            synchronized (Circulo.class) {
                if(instanciaCirculo == null) {
                    instanciaCirculo = new Circulo();
                }
            }

        }
        return instanciaCirculo;
    }

    public String criarCirculo(double raio) {
        return "Circulo criado com raio: " + raio;
    }
}
