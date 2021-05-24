package ingredientes.paes;

public class PaoBola implements Pao {
    private String paoBola;

    public PaoBola(String paoBola) {
        this.paoBola = paoBola;
    }

    @Override
    public Pao adicionarPao(String adicionarPao) {
        return new PaoBola(adicionarPao);
    }

    public String getPaoBola() {
        return paoBola;
    }

    public void setPaoBola(String paoBola) {
        this.paoBola = paoBola;
    }

    @Override
    public String toString() {
        return paoBola;
    }

}
