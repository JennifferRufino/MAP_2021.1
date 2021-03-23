package controleacademico;

import java.util.ArrayList;
import java.util.List;

public class ProfessorControle {

    private List<Professor> professores;

    public ProfessorControle() {
        this.professores = new ArrayList<Professor>();
    }

    /**
     * cadastra o professor na disciplina
     * @param prof
     * @param disc
     * @return
     */
    public boolean cadastrarProfessor(Professor prof, Disciplina disc) {
        if (!prof.disciplinas.contains(disc)) {
            prof.disciplinas.add(disc);
            professores.add(prof);
            return true;
        }
        return false;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
}
