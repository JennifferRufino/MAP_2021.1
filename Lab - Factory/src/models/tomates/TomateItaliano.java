package models.tomates;

public class TomateItaliano implements Tomate {
    private final String nome = "Tomate Italiano";

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (! (obj instanceof TomateItaliano)) {
            return false;
        }

        TomateItaliano outroTomate = (TomateItaliano)obj;

        return this.nome != null && this.nome.equals(outroTomate.getNome());
    }
}