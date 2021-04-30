package setor.financeiro;

public class Conta {
    private String nome;
    private double debito;
    private double credito;

    public Conta(String nome, double debito, double credito) {
        this.nome = nome;
        this.debito = debito;
        this.credito = credito;
    }

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
        if (! (obj instanceof Conta)) {
            return false;
        }

        Conta outraDivida = (Conta) obj;
        return this.nome != null && this.nome.equals(outraDivida.getNome());
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Conta: ")
                .append(this.nome)
                .append(", Débito: ")
                .append(this.debito)
                .append(", Crédito: ")
                .append(this.credito)
                .toString();
    }
}
