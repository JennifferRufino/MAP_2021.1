package ingredientes.tomates;

public class TomateItaliano implements Tomate {
    private String tomateItaliano;

    public TomateItaliano(String tomateItaliano) {
        this.tomateItaliano= tomateItaliano;
    }

    @Override
    public Tomate adicionarTomate(String tomateItaliano) {
        return new TomateItaliano(tomateItaliano);
    }

    public String getTomateItaliano() {
        return tomateItaliano;
    }


    public void setTomateItaliano(String tomateItaliano) {
        this.tomateItaliano = tomateItaliano;
    }

    @Override
    public String toString() {
        return tomateItaliano;
    }
}