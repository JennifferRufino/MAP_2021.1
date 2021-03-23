package controleacademico;

import java.util.ArrayList;
import java.util.List;

public class AlunoControle {

    private List<Aluno> alunos;

    public AlunoControle(){
        this.alunos = new ArrayList<Aluno>();
    }

    public boolean cadastrarAluno(Aluno aluno, Disciplina disc) {
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

    public int quantidadeAlunos(Disciplina disc) {
        int contador = 0;

        for (Aluno aluno : alunos) {
            if (aluno.disciplinas.contains(disc)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Retorna os alunos cadastrados na disciplina
     * @param disc
     */
    public void getAlunos(Disciplina disc) {
        System.out.println("\nAlunos cadastrados na disciplina " + disc.getNome() + ":");
        for (Aluno aluno : alunos) {
            if (aluno.disciplinas.contains(disc)) {
                System.out.println(aluno);
            }
        }
    }

    /**
     * Retorna as disciplinas que o aluno tá cadastrado
     * @param aluno
     */
    public void disciplinasAluno(Aluno aluno) {
        System.out.println("Disciplinas cadastradas do(a) aluno(a) " + aluno.getNome() + ":\n");
        for (Disciplina disciplina : aluno.disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
