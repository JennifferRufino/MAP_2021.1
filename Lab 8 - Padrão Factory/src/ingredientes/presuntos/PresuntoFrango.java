package ingredientes.presuntos;

public class PresuntoFrango implements Presunto {
    private String presuntoFrango;

    public PresuntoFrango(String presuntoFrango) {
        this.presuntoFrango = presuntoFrango;
    }

    @Override
    public Presunto adicionarPresunto(String presuntoFrango) {
        return new PresuntoFrango(presuntoFrango);
    }

    public String getPresuntoFrango() {
        return presuntoFrango;
    }

    public void setPresuntoFrango(String presuntoFrango) {
        this.presuntoFrango = presuntoFrango;
    }

    @Override
    public String toString() {
        return presuntoFrango;
    }
}