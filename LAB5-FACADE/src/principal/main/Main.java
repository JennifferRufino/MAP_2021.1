package principal.main;

import principal.sig.SIG;
import setor.professor.Disciplina;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SIG sig = new SIG();

        //MANIPULAÇÃO DAS INFORMAÇÕES DOS ALUNOS
        System.out.println("");
        sig.getAluno().cadastrarAluno("Jenniffer Rufino", new ArrayList<>(Arrays.asList(new Disciplina("Banco de Dados"), new Disciplina("Técnica de análise de algoritmos"))));
        sig.getAluno().cadastrarAluno("Rodolffo Matthaus", new ArrayList<>(Arrays.asList(new Disciplina("Cálculo I"), new Disciplina("Álgebra Linear"))));
        sig.getAluno().mostrarRDMDoAluno("Jenniffer Rufino");
        sig.getAluno().mostrarRDMDoAluno("Rodolffo Matthaus");

        //MANIPULAÇÃO DAS INFORMAÇÕES DOS PROFESSORES
        System.out.println("");
        sig.getProfessor().cadastrarProfessor("Paulo Silva", new ArrayList<>(Arrays.asList(new Disciplina("Cálculo I"), new Disciplina("Álgebra Linear"))), 2.0);
        sig.getProfessor().cadastrarProfessor("Sabrina Souto", new ArrayList<>(Arrays.asList(new Disciplina("Métodos de análise de programação"), new Disciplina("Linguagem de Programação II"))), 1.6);
        sig.getProfessor().cadastrarProfessor("Luciana", new ArrayList<>(Arrays.asList(new Disciplina("Linguagem de Programação I"), new Disciplina("Linguagem de Programação II"))), 4.0);
        sig.getProfessor().mostrarProfessores();

        System.out.println("Tempo de casa de um professor");
        sig.getProfessor().mostrarTempoDeCasa("Paulo Silva");

        System.out.println("Professores de uma mesma disciplina");
        sig.getProfessor().mostrarProfessoresPorDisciplina("Linguagem de Programação II");

        //MANIPULAÇÃO DAS INFORMAÇÕES ADMINISTRATIVAS
        sig.getAdministrativo().agendarReuniaoDaDiretoria(LocalDate.of(2021, 04, 4));
        sig.getAdministrativo().agendarReuniaoDaDiretoria(LocalDate.of(2021, 04, 25));
        sig.getAdministrativo().reunioesAgendadasDiretoria();
        sig.getAdministrativo().agendarEntrevistaDaDiretoria(LocalDate.of(2021, 04, 24));
        sig.getAdministrativo().agendarEntrevistaDaDiretoria(LocalDate.of(2021, 04, 12));
        sig.getAdministrativo().entrevistasAgendadasDiretoria();

        //MANIPULAÇÃO DAS INFORMAÇÕES DO FINANCEIRO
        sig.getFinanceiro().cadastrarConta("Bolsas", 4000.00, 0.00);
        sig.getFinanceiro().cadastrarConta("Contas à pagar", 0.00, 10000.00);
        sig.getFinanceiro().mostrarBalanco();

        sig.getFinanceiro().cadastrarFuncionario("Paulo Silva", 3000.00);
        sig.getFinanceiro().cadastrarFuncionario("Maria Gomes", 5000.00);
        sig.getFinanceiro().mostrarFolhaDePagamentos();


        //MANIPULAÇÃO DAS INFORMAÇÕES DO ALMOXARIFADO
        System.out.println("");
        sig.getAlmoxarifado().cadastrarProduto("Cadeira", 300.00);
        sig.getAlmoxarifado().cadastrarProduto("Apagador", 33.95);
        sig.getAlmoxarifado().comprarProduto("Computador", 1785.00);
        sig.getAlmoxarifado().mostrarEstoque();


        //MANIPULAÇÃO DAS INFORMAÇÕES DE INFRA-ESTRUTURA
        System.out.println("");
        sig.getInfraEstrutura().cadastrarSala(201, "A", true);
        sig.getInfraEstrutura().cadastrarSala(103, "C", true);
        sig.getInfraEstrutura().cadastrarSala(104, "B", true);
        sig.getInfraEstrutura().reservarSala("Sabrina Souto", 103, "C");
        sig.getInfraEstrutura().mostrarSalas();
        sig.getInfraEstrutura().mostrarSalasDisponiveis();

    }
}
