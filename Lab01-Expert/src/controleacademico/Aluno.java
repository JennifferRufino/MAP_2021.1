package controleacademico;

public class Aluno extends Pessoa {
    final int QUANT_DISCIPLINAS = 7;

    public Aluno(String id, String nome){
        super(id, nome);
    }

    @Override
    public String toString() {
        return "\nAluno:\nID = " + id + "\nNome = " + nome + "";
    }
}
