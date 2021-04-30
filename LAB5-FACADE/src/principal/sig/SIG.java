package principal.sig;

import setor.administrativo.Administrativo;
import setor.almoxarifado.Almoxarifado;
import setor.aluno.AlunoFacade;
import setor.financeiro.Financeiro;
import setor.infraEstrutura.InfraEstrutura;
import setor.professor.ProfessorFacade;

public class SIG {
    final private Financeiro financeiro;
    final private Administrativo administrativo;
    final private ProfessorFacade professor;
    final private AlunoFacade aluno;
    final private Almoxarifado almoxarifado;
    final private InfraEstrutura infraEstrutura;

    public SIG() {
        this.financeiro = new Financeiro();
        this.administrativo = new Administrativo();
        this.professor = new ProfessorFacade();
        this.aluno = new AlunoFacade();
        this.almoxarifado = new Almoxarifado();
        this.infraEstrutura = new InfraEstrutura();
    }

    public Financeiro getFinanceiro() {
        return this.financeiro;
    }

    public Administrativo getAdministrativo() {
        return this.administrativo;
    }

    public ProfessorFacade getProfessor() {
        return this.professor;
    }

    public AlunoFacade getAluno() {
        return this.aluno;
    }

    public Almoxarifado getAlmoxarifado() {
        return this.almoxarifado;
    }

    public InfraEstrutura getInfraEstrutura() {
        return this.infraEstrutura;
    }
}
