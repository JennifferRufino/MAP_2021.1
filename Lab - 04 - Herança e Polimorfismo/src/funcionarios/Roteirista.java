package funcionarios;

public class Roteirista extends Pessoa implements Funcionario {

    public Roteirista(String nome) {
        super(nome);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getFuncao() {
        return this.funcao = "Roteirista";
    }

    @Override
    public String toString() {
        return "Nome = " + nome + " - Função = " + funcao + "";
    }
}
