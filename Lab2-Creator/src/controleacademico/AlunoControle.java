package controleacademico;

import java.util.ArrayList;
import java.util.List;

public class AlunoControle {

    private List<Aluno> alunos;

    public AlunoControle(){
        this.alunos = new ArrayList<Aluno>();
    }

    public boolean cadastrarAluno(String idAluno, String nomeAluno, String codigo, String nomeDisc, String curso, String horario) {
        Aluno aluno = new Aluno(idAluno, nomeAluno);
        Disciplina disc = new Disciplina(codigo, nomeDisc, curso, horario);

        if (!aluno.disciplinas.contains(disc)) {
            if (aluno.disciplinas.size() < aluno.QUANT_DISCIPLINAS) {
                aluno.disciplinas.add(disc);

                if (!alunos.contains(aluno)) {
                    alunos.add(aluno);
                }
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna a quantidade de alunos em uma determinada disciplina
     */
    public int quantidadeAlunos(String nomeDisciplina) {
        int i = 0;
        int contador = 0;

        for (Aluno aluno : alunos) {
            if (aluno.getDisciplinas().get(i).getNome().equals(nomeDisciplina)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Mostra os alunos cadastrados em uma determinada disciplina
     */
    public void getAlunos(String nomeDisciplina) {
        int i = 0;

        System.out.println("\nAlunos cadastrados na disciplina " + nomeDisciplina + ":");
        for (Aluno aluno : alunos) {
            if (aluno.getDisciplinas().get(i).getNome().equals(nomeDisciplina)) {
                System.out.println(aluno);
            }
        }
    }

    /**
     * Mostra as disciplinas do aluno
     */
    public void disciplinasAluno(String nomeAluno) {
        System.out.println("Disciplinas cadastradas do(a) aluno(a) " + nomeAluno + ":\n");
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nomeAluno)) {
                aluno.disciplinas();
            }
        }
    }

    /**
     * Mostra o horário do aluno
     */
    public void horarioAluno(String nomeAluno) {
        System.out.println("\nHorário do(a) aluno(a) " + nomeAluno + ":\n");
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nomeAluno)) {
                aluno.horario();
            }
        }
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
