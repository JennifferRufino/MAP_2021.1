package funcionarios;

public class Diretor extends Pessoa implements Funcionario {
    public Diretor(String nome) {
        super(nome);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getFuncao() {
        return this.funcao = "Diretor";
    }

    @Override
    public String toString() {
        return "Nome = " + nome + " - Função = " + funcao + "";
    }
}
