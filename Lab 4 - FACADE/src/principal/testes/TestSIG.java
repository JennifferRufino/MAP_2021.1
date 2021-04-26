package principal.testes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import principal.sig.SIG;
import setor.administrativo.Evento;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSIG {
    static SIG sig = null;

    @BeforeAll
    static void iniciarSistema(){
        sig = new SIG();
    }

    @Test
    void testAlunoSIG() {
        sig.matricularAluno("Gilberto", "Economia");
        sig.matricularAlunoNaDisciplina(0, 123, "Matemática básica");
        sig.matricularAlunoNaDisciplina(0, 432, "Estatística");
        sig.adicionarAoHistoricoDoAluno(0, 567, "Ética");
        sig.adicionarAoHistoricoDoAluno(0, 789, "Metodologia Científica");

        String expected = "Aluno: Gilberto - Curso: Economia\n" + "RDM - Disciplinas Matriculadas:\n" + "Código: 123 - Disciplina: Matemática básica\n" + "Código: 432 - Disciplina: Estatística\n";

        assertEquals(expected, sig.consultarAlunoRDM(0));

        expected = "Aluno: Gilberto - Curso: Economia\n" + "Histórico de Disciplinas:\n" + "Código: 567 - Disciplina: Ética\n" + "Código: 789 - Disciplina: Metodologia Científica\n";

        assertEquals(expected, sig.consultarAlunoHistorico(0));
    }

    @Test
    void testProfessorSIG() {
        sig.matricularProfessor("Fabio", 3);
        sig.cadastrarProfessorNaDisciplina(0, 735, "Estrutura de dados");
        sig.cadastrarProfessorNaDisciplina(0, 679, "Banco de dados");

        String expected = "Professor: Fabio - Tempo de Casa: 3\n" + "Alocado nas disciplinas:\n" + "Código: 735 - Disciplina: Estrutura de dados\n" + "Código: 679 - Disciplina: Banco de dados\n";

        assertEquals(expected, sig.consultarInfoProfessor(0));
    }

    @Test
    void testAdminSIG() {
        sig.cadastrarEventosAdmin(Evento.TipoEvento.ENTREVISTA, "30-04-2021");
        sig.cadastrarEventosAdmin(Evento.TipoEvento.REUNIAO, "29-04-2021");
        sig.cadastrarEventosAdmin(Evento.TipoEvento.REUNIAO, "28-04-2021");

        String expected = "Eventos da Diretoria: \n" + "Evento: Entrevista - Data: 30-04-2021\n" + "Evento: Reunião - Data: 29-04-2021\n" + "Evento: Reunião - Data: 28-04-2021\n";

        assertEquals(expected, sig.listarEventosAdmin());
    }

    @Test
    void testAlmoxarifadoSIG() {
        sig.inserirNoEstoque("Desinfetante", 120);
        sig.inserirNoEstoque("Feijão", 30);
        sig.inserirNoEstoque("Leite em Pó", 8);

        String expected = "Estoque dos produtos:\n" + "Produto: Desinfetante - Quantidade: 120\n" + "Produto: Feijão - Quantidade: 30\n" + "Produto: Leite em Pó - Quantidade: 8\n";

        assertEquals(expected, sig.consultarEstoque());

        sig.realizarPedido("Sabao", 24);
        sig.realizarPedido("Cerveja Itaipava", 300);
        sig.realizarPedido("Chocotone", 30);

        expected = "Lista de Pedidos:\n" + "Produto: Sabao - Quantidade: 24\n" + "Produto: Cerveja Itaipava - Quantidade: 300\n" + "Produto: Chocotone - Quantidade: 30\n";

        assertEquals(expected, sig.consultarListaPedidos());
    }

    @Test
    void testFinanceiroSIG() {
        sig.novaFolhaDePagamento("Abril/2021");
        sig.adicionarFuncionarioAFolha(0, "Rodolffo Matthaus", 1550);
        sig.adicionarFuncionarioAFolha(0, "Arthur Picoli", 2200);
        sig.adicionarFuncionarioAFolha(0, "Caio Afiune", 1100);

        String expected = "Folha de Pagamento do mês de Abril/2021\n" + "Funcionário: Rodolffo Matthaus - Salário: 1550,00\n" + "Funcionário: Arthur Picoli - Salário: 2200,00\n" + "Funcionário: Caio Afiune - Salário: 1100,00\n";

        assertEquals(expected, sig.consultarFolhaDePagamento(0));

        sig.novoBalanco("Abril");
        sig.adicionarContaBalanco(0, "Água", 59.50);
        sig.adicionarContaBalanco(0, "Energia", 231.00);
        sig.adicionarContaBalanco(0, "Internet", 119.90);
        sig.adicionarContaBalanco(0, "Combustível", 550.00);

        expected = "Contas do mês de Abril\n" + "Conta: Água - Valor: 59,50\n" + "Conta: Energia - Valor: 231,00\n" + "Conta: Internet - Valor: 119,90\n" + "Conta: Combustível - Valor: 550,00\n";


        assertEquals(expected, sig.consultarBalanco(0));
    }

    @Test
    void testAlocacaoSIG() {
        sig.alocarSala("104", "B");
        sig.alocarSala("Lab. IV", "CIAC");
        sig.alocarSala("Lab. II", "CIAC");

        String expected = "Salas Alocadas:\n" + "Sala: 104 - Bloco: B\n" + "Sala: Lab. IV - Bloco: CIAC\n" + "Sala: Lab. II - Bloco: CIAC\n";

        assertEquals(expected, sig.consultarSalasAlocadas());
    }
}
