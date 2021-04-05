package controleacademico;

public class Disciplina {
    private String codigo;
    private String nome;
    private String curso;
    private String horario;

    public Disciplina(String codigo, String nome, String curso, String horario) {
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;
        this.horario = horario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Disciplina:\nCódigo = " + codigo + "\nNome = " + nome + "\nCurso = " + curso + "\nHorário = "
                + horario + "";
    }
}
