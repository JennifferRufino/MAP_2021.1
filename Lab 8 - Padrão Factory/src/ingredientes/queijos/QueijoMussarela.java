package ingredientes.queijos;

public class QueijoMussarela implements Queijo {
    private String queijoMussarela;

    public QueijoMussarela(String queijoMussarela) {
        this.queijoMussarela = queijoMussarela;
    }

    @Override
    public Queijo adicionarQueijo(String queijoMussarela) {
        return new QueijoMussarela(queijoMussarela);
    }

    public String getQueijoMussarela() {
        return queijoMussarela;
    }

    public void setQueijoMussarela(String queijoMussarela) {
        this.queijoMussarela = queijoMussarela;
    }

    @Override
    public String toString() {
        return queijoMussarela;
    }
}