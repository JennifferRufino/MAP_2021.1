package ingredientes.tomates;

public class TomateCereja implements Tomate {
    private String tomateCereja;

    public TomateCereja(String tomateCereja) {
        this.tomateCereja = tomateCereja;
    }

    @Override
    public Tomate adicionarTomate(String tomateCereja) {
        return new TomateCereja(tomateCereja);
    }

    public String getTomateCereja() {
        return tomateCereja;
    }


    public void setTomateCereja(String tomateCereja) {
        this.tomateCereja = tomateCereja;
    }

    @Override
    public String toString() {
        return tomateCereja;
    }
}
