package filme;

import funcionarios.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private int ano;
    private String duracao;
    private String genero;
    private String trilhasonora;
    private Funcionario ator;
    private Funcionario diretor;
    private Funcionario camera;
    private Funcionario roteirista;
    private List<Funcionario> funcionarios;

    public Filme(String nome, int ano, String duracao, String genero, String trilhasonora, Funcionario ator, Funcionario diretor, Funcionario camera, Funcionario roteirista) {
        this.nome = nome;
        this.ano = ano;
        this.duracao = duracao;
        this.genero = genero;
        this.trilhasonora = trilhasonora;
        this.ator = ator;
        this.diretor = diretor;
        this.camera = camera;
        this.roteirista = roteirista;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public Filme() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTrilhasonora() {
        return trilhasonora;
    }

    public void setTrilhasonora(String trilhasonora) {
        this.trilhasonora = trilhasonora;
    }

    public Funcionario getAtor() {
        return ator;
    }

    public void setAtor(Funcionario ator) {
        this.ator = ator;
    }

    public Funcionario getDiretor() {
        return diretor;
    }

    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }

    public Funcionario getCamera() {
        return camera;
    }

    public void setCamera(Funcionario camera) {
        this.camera = camera;
    }

    public Funcionario getRoteirista() {
        return roteirista;
    }

    public void setRoteirista(Funcionario roteirista) {
        this.roteirista = roteirista;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "Filme \nNome = " + nome + "\nAno = " + ano + "Duração = " + duracao + "\nGênero = " + genero
                + "\nTrilha Sonora = " + trilhasonora + "\nEquipe = " + funcionarios + "";
    }
}
