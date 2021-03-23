package entidades;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa extends Entity{
    private String nome;
    private String matricula;

    private List<Horario> horarios;

    public Pessoa() {
        this.horarios = new ArrayList<>();
    }

    public Pessoa(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public Pessoa(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.horarios = horarios;
        this.horarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public String getFullHorarioInformation() {

        StringBuilder information = new StringBuilder();

        for(Horario horario : this.horarios) {
            information.append(horario.getDisciplina().toString());
            information.append("\n");
        }

        return information.toString();
    }
}

