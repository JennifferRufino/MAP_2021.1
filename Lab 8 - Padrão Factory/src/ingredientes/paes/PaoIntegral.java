package ingredientes.paes;

public class PaoIntegral implements Pao {
    private String paoIntegral;

    public PaoIntegral(String paoIntegral) {
        this.paoIntegral = paoIntegral;
    }

    @Override
    public Pao adicionarPao(String paoIntegral) {
        return new PaoIntegral(paoIntegral);
    }

    public String getPaoIntegral() {
        return paoIntegral;
    }

    public void setPaoIntegral(String paoIntegral) {
        this.paoIntegral = paoIntegral;
    }

    @Override
    public String toString() {
        return paoIntegral;
    }
}