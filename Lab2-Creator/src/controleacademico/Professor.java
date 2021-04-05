package controleacademico;

public class Professor extends Pessoa {

    public Professor(String id, String nome){
        super(id, nome);
    }

    /**
     * Mostra o nome das disciplinas que o professor irá ministrar
     */
    public void disciplinas() {
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }

    /**
     * Mostra o horário do professor
     */
    public void horario() {
        System.out.println(getDisciplinas());
    }

    @Override
    public String toString() {
        return "\nProfessor:\nID = " + id + "\nNome = " + nome + "";
    }
}
