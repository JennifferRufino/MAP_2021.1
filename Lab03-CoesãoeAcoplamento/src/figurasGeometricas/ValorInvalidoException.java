package figurasGeometricas;

public class ValorInvalidoException extends Exception {
    private static final long serialVersionUID = 1L;

    public ValorInvalidoException() {
        super("O valor passado não pode ser menor ou igual a zero!");
    }
}
