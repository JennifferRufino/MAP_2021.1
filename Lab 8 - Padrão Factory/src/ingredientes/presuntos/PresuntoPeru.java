package ingredientes.presuntos;

public class PresuntoPeru implements Presunto {
    private String presuntoPeru;

    public PresuntoPeru(String presuntoPeru) {
        this.presuntoPeru = presuntoPeru;
    }

    @Override
    public Presunto adicionarPresunto(String presuntoPeru) {
        return new PresuntoPeru(presuntoPeru);
    }

    public String getPresuntoPeru() {
        return presuntoPeru;
    }

    public void setPresuntoPeru(String presuntoPeru) {
        this.presuntoPeru = presuntoPeru;
    }

    @Override
    public String toString() {
        return presuntoPeru;
    }
}