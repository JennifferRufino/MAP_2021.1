package ingredientes.queijos;

public class QueijoCheddar implements Queijo {
    private String queijoCheddar;

    public QueijoCheddar(String queijoCheddar) {
        this.queijoCheddar = queijoCheddar;
    }

    @Override
    public Queijo adicionarQueijo(String queijoCheddar) {
        return new QueijoCheddar(queijoCheddar);
    }

    public String getQueijoCheddar() {
        return queijoCheddar;
    }

    public void setQueijoCheddar(String queijoCheddar) {
        this.queijoCheddar = queijoCheddar;
    }

    @Override
    public String toString() {
        return queijoCheddar;
    }
}