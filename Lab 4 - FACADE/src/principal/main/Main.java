package principal.main;

import principal.sig.SIG;
import setor.administrativo.Evento.TipoEvento;

public class Main {
    public static void main(String[] args) {
        SIG sig = new SIG();

        //MANIPULAÇÃO DAS INFORMAÇÕES DOS ALUNOS
        sig.matricularAluno("Jenniffer", "Computação");
        sig.matricularAlunoNaDisciplina(0, 123, "MAP");
        sig.matricularAlunoNaDisciplina(0, 432, "TAAL");
        sig.adicionarAoHistoricoDoAluno(0, 567, "BD");
        sig.adicionarAoHistoricoDoAluno(0, 789, "Redes");
        System.out.println(sig.consultarAlunoRDM(0));
        System.out.println(sig.consultarAlunoHistorico(0));

        //MANIPULAÇÃO DAS INFORMAÇÕES DOS PROFESSORES
        sig.matricularProfessor("Fábio Luiz", 6);
        sig.cadastrarProfessorNaDisciplina(0, 735, "BD");
        sig.cadastrarProfessorNaDisciplina(0, 679, "TAAL");
        System.out.println(sig.consultarInfoProfessor(0));

        //MANIPULAÇÃO DAS INFORMAÇÕES ADMINISTRATIVAS
        sig.cadastrarEventosAdmin(TipoEvento.ENTREVISTA, "30-04-2021");
        sig.cadastrarEventosAdmin(TipoEvento.REUNIAO, "29-04-2021");
        sig.cadastrarEventosAdmin(TipoEvento.REUNIAO, "28-04-2021");
        System.out.println(sig.listarEventosAdmin());

        //MANIPULAÇÃO DAS INFORMAÇÕES DO ALMOXARIFADO
        sig.inserirNoEstoque("Açúcar Favorito", 240);
        sig.inserirNoEstoque("Arroz Favorito", 180);
        sig.inserirNoEstoque("Nescafé", 60);
        System.out.println(sig.consultarEstoque());

        sig.realizarPedido("Creme Dental Colgate", 100);
        sig.realizarPedido("Lâmpadas", 2);
        sig.realizarPedido("Apagador", 6);
        System.out.println(sig.consultarListaPedidos());

        //MANIPULAÇÃO DAS INFORMAÇÕES DO FINANCEIRO
        sig.novaFolhaDePagamento("Janeiro");
        sig.adicionarFuncionarioAFolha(0, "Rodolffo", 1200);
        sig.adicionarFuncionarioAFolha(0, "Juliette", 1500);
        sig.adicionarFuncionarioAFolha(0, "Arthur", 998);
        System.out.println(sig.consultarFolhaDePagamento(0));

        sig.novoBalanco("Novembro");
        sig.adicionarContaBalanco(0, "Água", 39.99);
        sig.adicionarContaBalanco(0, "Energia", 129.00);
        sig.adicionarContaBalanco(0, "Internet", 89.90);
        sig.adicionarContaBalanco(0, "Combustível", 450.00);
        System.out.println(sig.consultarBalanco(0));

        //MANIPULAÇÃO DAS INFORMAÇÕES DE INFRA-ESTRUTURA
        sig.alocarSala("104", "B");
        sig.alocarSala("Lab. IV", "CIAC");
        sig.alocarSala("Lab. II", "CIAC");
        System.out.println(sig.consultarSalasAlocadas());
    }
}
