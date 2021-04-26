package principal.sig;

import setor.academico.Aluno;
import setor.academico.Professor;
import setor.administrativo.Administrativo;
import setor.administrativo.Evento;
import setor.almoxarifado.Almoxarifado;
import setor.financeiro.Financeiro;
import setor.infraEstrutura.Alocacao;

import java.util.ArrayList;
import java.util.List;

public class SIG {
    private List<Aluno> listaAlunos;
    private List<Professor> listaProfessores;
    private Administrativo adm;
    private Almoxarifado al;
    private Financeiro fin;
    private Alocacao aloc;

    public SIG() {
        listaAlunos = new ArrayList<>();
        listaProfessores = new ArrayList<>();
        adm = new Administrativo();
        al = new Almoxarifado();
        fin = new Financeiro();
        aloc = new Alocacao();
    }

    //INFORMAÇÕES DOS ALUNOS
    public void matricularAluno(String nome, String curso) {
        listaAlunos.add(new Aluno(nome, curso));
    }

    public void matricularAlunoNaDisciplina(int aluno, int cod, String disc) {
        listaAlunos.get(aluno).matricularDisciplina(cod, disc);
    }

    public void adicionarAoHistoricoDoAluno(int aluno, int cod, String disc) {
        listaAlunos.get(aluno).adicionarAoHistorico(cod, disc);
    }

    public String consultarAlunoRDM(int aluno) {
        return listaAlunos.get(aluno).consultarRDM();
    }

    public String consultarAlunoHistorico(int aluno) {
        return listaAlunos.get(aluno).consultarHistorico();
    }

    //INFORMAÇÕES DOS PROFESSORES
    public void matricularProfessor(String nome, int tempoDeCasa) {
        listaProfessores.add(new Professor(nome, tempoDeCasa));
    }

    public void cadastrarProfessorNaDisciplina(int prof, int cod, String disc) {
        listaProfessores.get(prof).alocarNaDisciplina(cod, disc);
    }

    public String consultarInfoProfessor(int prof) {
        return listaProfessores.get(prof).infoProfessor();
    }

    //INFORMAÇÕES ADMINISTRATIVAS
    public void cadastrarEventosAdmin(Evento.TipoEvento tipo, String data) {
        adm.cadastrarEvento(tipo, data);
    }

    public String listarEventosAdmin() {
        return adm.listarEventos();
    }

    //INFORMAÇÕES DO ALMOXARIFADO
    public void inserirNoEstoque(String produto, int quantidade) {
        al.inserirNoEstoque(produto, quantidade);
    }

    public void realizarPedido(String produto, int quantidade) {
        al.realizarPedido(produto, quantidade);
    }

    public String consultarEstoque() {
        return al.listarEstoque();
    }

    public String consultarListaPedidos() {
        return al.listarPedidos();
    }

    //INFORMAÇÕES DO FINANCEIRO
    public void novaFolhaDePagamento(String mes) {
        fin.novaFolhaDePagamento(mes);
    }

    public void novoBalanco(String mes) {
        fin.novoBalancoDeContas(mes);
    }

    public void adicionarFuncionarioAFolha(int folha, String nome, double salario){
        fin.addFuncionarioAFolha(folha, nome, salario);
    }

    public void adicionarContaBalanco(int balanco, String conta, double valor) {
        fin.addContaAoBalanco(balanco, conta, valor);
    }

    public String consultarFolhaDePagamento(int mes) {
        return fin.consultarInfoFolha(mes);
    }

    public String consultarBalanco(int mes) {
        return fin.consultarBalanco(mes);
    }

    //INFORMAÇÕES DE INFRA-ESTRUTURA
    public void alocarSala(String sala, String bloco) {
        aloc.alocarSala(sala, bloco);
    }

    public String consultarSalasAlocadas() {
        return aloc.listarSalasAlocadas();
    }
}
