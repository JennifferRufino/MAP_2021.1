package controleacademico;

public class Aluno extends Pessoa {
    final int QUANT_DISCIPLINAS = 7;

    public Aluno(String id, String nome){
        super(id, nome);
    }

    /**
     * Mostra o nome das disciplinas do aluno
     */
    public void disciplinas() {
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }

    /**
     * Mostra o horário do aluno
     */
    public void horario() {
        System.out.println(getDisciplinas());
    }

    @Override
    public String toString() {
        return "\nAluno:\nID = " + id + "\nNome = " + nome + "";
    }
}
