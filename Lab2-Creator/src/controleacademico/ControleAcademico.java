package controleacademico;

public class ControleAcademico {
    public static void main(String[] args) {
        AlunoControle alunocontrole = new AlunoControle();
        ProfessorControle professorcontrole = new ProfessorControle();

        //Cadastrando o aluno na disciplina
        alunocontrole.cadastrarAluno("A01", "Jenniffer Rufino", "D01", "Técnicas de análise de algoritmos", "Ciência da Computação", "Segunda 07h - 09h/Sexta 07h - 09h");
        alunocontrole.cadastrarAluno("A01", "Jenniffer Rufino", "D02", "Métodos Avançados de Programação", "Ciência da Computação", "Segunda 9h - 11h/Quarta 7h - 9h");
        alunocontrole.cadastrarAluno("A01", "Jenniffer Rufino", "D03", "Banco de Dados", "Ciência da Computação", "Terça 7h - 9h/Quinta 9h - 11h");
        alunocontrole.cadastrarAluno("A01", "Jenniffer Rufino", "D04", "Engenharia de software", "Ciência da Computação", "Terça 9h - 11h/Quinta 7h - 9h");
        alunocontrole.cadastrarAluno("A02", "Rodolffo Matthaus", "D01", "Técnicas de análise de algoritmos", "Ciência da Computação", "Segunda 07h - 09h/Sexta 07h - 09h");
        alunocontrole.cadastrarAluno("A02", "Rodolffo Matthaus", "D02", "Métodos Avançados de Programação", "Ciência da Computação", "Segunda 9h - 11h/Quarta 7h - 9h");
        alunocontrole.cadastrarAluno("A03", "Sarah Caroline", "D01", "Técnicas de análise de algoritmos", "Ciência da Computação", "Segunda 07h - 09h/Sexta 07h - 09h");
        alunocontrole.cadastrarAluno("A04", "Isabella Cecchi", "D01", "Técnicas de análise de algoritmos", "Ciência da Computação", "Segunda 07h - 09h/Sexta 07h - 09h");
        alunocontrole.cadastrarAluno("A05", "Jakelyne Oliveira", "D01", "Técnicas de análise de algoritmos", "Ciência da Computação", "Segunda 07h - 09h/Sexta 07h - 09h");

        //Cadastra o professor na disciplina
        professorcontrole.cadastrarProfessor("P01", "Fábio Leite", "D01", "Técnicas de análise de algoritmos", "Ciência da Computação", "Segunda 07h - 09h/Sexta 07h - 09h");
        professorcontrole.cadastrarProfessor("P02", "Sabrina Souto", "D02", "Métodos Avançados de Programação", "Ciência da Computação", "Segunda 9h - 11h/Quarta 7h - 9h");

        System.out.println("----------DADOS DO ALUNO----------\n");

        //Disciplinas cursadas pelo aluno
        alunocontrole.disciplinasAluno("Jenniffer Rufino");

        //Alunos matriculados em uma disciplina
        alunocontrole.getAlunos("Técnicas de análise de algoritmos");

        //Horário correspondente ao aluno
        alunocontrole.horarioAluno("Jenniffer Rufino");

        //Quantidade de alunos em uma disciplina
        System.out.println("\nQuantidade de alunos na disciplina:\n");
        System.out.println(alunocontrole.quantidadeAlunos("Técnicas de análise de algoritmos"));

        System.out.println("\n----------DADOS DO PROFESSOR----------\n");

        //Disciplinas do professor
        professorcontrole.disciplinasProfessor("Sabrina Souto");

        //Horário do professor
        professorcontrole.horarioProfessor("Sabrina Souto");
    }

}
