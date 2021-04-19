package funcionarios;

public class Ator extends Pessoa implements Funcionario {
    public Ator(String nome) {
        super(nome);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getFuncao() {
        return this.funcao = "Ator";
    }

    @Override
    public String toString() {
        return "Nome = " + nome + " - Função = " + funcao + "";
    }
}
