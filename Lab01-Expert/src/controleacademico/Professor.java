package controleacademico;

public class Professor extends Pessoa {

    public Professor(String id, String nome){
        super(id, nome);
    }

    /**
     * a.Quais disciplinas um professor mministra
     */
    public void disciplinasProfessor() {
        System.out.println("Disciplinas ministradas pelo(a) professor(a) " + nome + ":\n");
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }
}
