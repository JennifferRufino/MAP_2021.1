package controleacademico;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    protected String id;
    protected String nome;
    protected List<Disciplina> disciplinas;

    public Pessoa(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {

        StringBuffer string = new StringBuffer();
        for (Disciplina disciplina : disciplinas) {
            string.append(disciplina.getNome());
        }
        return string.toString();
    }
}
