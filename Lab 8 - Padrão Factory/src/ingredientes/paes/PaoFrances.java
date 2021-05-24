package ingredientes.paes;

public class PaoFrances implements Pao {
    private String paoFrances;

    public PaoFrances(String paoFrances) {
        this.paoFrances = paoFrances;
    }

    @Override
    public Pao adicionarPao(String paoFrances) {
        return new PaoFrances(paoFrances);
    }

    public String getPaoFrances() {
        return paoFrances;
    }

    public void setPaoFrances(String paoFrances) {
        this.paoFrances = paoFrances;
    }

    @Override
    public String toString() {
        return paoFrances;
    }

}