package funcionarios;

public class Camera extends Pessoa implements Funcionario {
    public Camera(String nome) {
        super(nome);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getFuncao() {
        return this.funcao = "Câmera";
    }

    @Override
    public String toString() {
        return "Nome = " + nome + " - Função = " + funcao + "";
    }
}
