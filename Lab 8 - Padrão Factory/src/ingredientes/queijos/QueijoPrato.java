package ingredientes.queijos;

public class QueijoPrato implements Queijo {
    private String queijoPrata;

    public QueijoPrato(String queijoPrata) {
        this.queijoPrata = queijoPrata;
    }


    @Override
    public Queijo adicionarQueijo(String queijoPrata) {
        return new QueijoPrato(queijoPrata);
    }

    public String getQueijoPrata() {
        return queijoPrata;
    }

    public void setQueijoPrata(String queijoPrata) {
        this.queijoPrata = queijoPrata;
    }

    @Override
    public String toString() {
        return queijoPrata;
    }
}