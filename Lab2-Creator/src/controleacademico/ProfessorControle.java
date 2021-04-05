package controleacademico;

import java.util.ArrayList;
import java.util.List;

public class ProfessorControle {

    private List<Professor> professores;

    public ProfessorControle() {
        this.professores = new ArrayList<Professor>();
    }

    /**
     * Cadastra o professor na disciplina
     */
    public boolean cadastrarProfessor(String idProf, String nomeProf, String codigo, String nomeDisc, String curso, String horario) {
        Professor prof = new Professor(idProf, nomeProf);
        Disciplina disc = new Disciplina(codigo, nomeDisc, curso, horario);

        if (!prof.disciplinas.contains(disc)) {
            prof.disciplinas.add(disc);
            professores.add(prof);
            return true;
        }
        return false;
    }

    /**
     * Mostra as disciplinas que o professor irá ministrar
     */
    public void disciplinasProfessor(String nomeProfessor) {
        System.out.println("Disciplinas ministradas pelo(a) professor(a) " + nomeProfessor + ":\n");
        for (Professor professor : professores) {
            if (professor.getNome().equals(nomeProfessor)) {
                professor.disciplinas();
            }
        }
    }

    /**
     * Mostra o horário do professor
     */
    public void horarioProfessor(String nomeProfessor) {
        System.out.println("\nHorário do(a) professor(a) " + nomeProfessor + ":\n");
        for (Professor professor : professores) {
            if (professor.getNome().equals(nomeProfessor)) {
                professor.horario();
            }
        }
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
}
