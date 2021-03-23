package controleacademico;

public class ControleAcademico {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("A01", "Jenniffer Rufino");
        Aluno aluno1 = new Aluno("A02", "Rafaela Oliveira");
        Aluno aluno2 = new Aluno("A03", "Fernanda Medeiros");
        Aluno aluno3 = new Aluno("A04", "Hércules Bruno");
        Aluno aluno4 = new Aluno("A05", "Rodolffo Matthaus");
        Aluno aluno5 = new Aluno("A06", "Juliette Freire");

        Disciplina disciplina = new Disciplina("D01", "Paradigmas de programação", "Ciência da Computação", "Segunda 11h - 13h/Quarta 09h - 11h");
        Disciplina disciplina1 = new Disciplina("D02", "Métodos Avançados de Programação", "Ciência da Computação", "Segunda 9h - 11h/Sexta 11h - 13:00");
        Disciplina disciplina2 = new Disciplina("D03", "Banco de Dados", "Ciência da Computação", "Terça 7h - 9h/Sexta 7h - 09h");
        Disciplina disciplina3 = new Disciplina("D04", "Redes de computadores", "Ciência da Computação", "Quarta 11h - 13h/Quinta 7h - 9h");

        Professor p = new Professor("P01", "Sabrina Souto");

        //Controle do aluno
        AlunoControle alunocontrole = new AlunoControle();

        //Controle do professor
        ProfessorControle controleprofessor = new ProfessorControle();

        //Cadastrar aluno na disciplina
        alunocontrole.cadastrarAluno(aluno, disciplina);
        alunocontrole.cadastrarAluno(aluno, disciplina1);
        alunocontrole.cadastrarAluno(aluno, disciplina2);
        alunocontrole.cadastrarAluno(aluno, disciplina3);
        alunocontrole.cadastrarAluno(aluno1, disciplina2);
        alunocontrole.cadastrarAluno(aluno1, disciplina3);
        alunocontrole.cadastrarAluno(aluno2, disciplina);
        alunocontrole.cadastrarAluno(aluno3, disciplina);
        alunocontrole.cadastrarAluno(aluno4, disciplina);

        System.out.println("----------DADOS DO ALUNO----------\n");

        //Disciplinas de um aluno
        alunocontrole.disciplinasAluno(aluno);

        //Alunos de uma disciplina
        alunocontrole.getAlunos(disciplina);

        //Horário do aluno
        System.out.println("\nHorário do(a) aluno(a) " + aluno.nome + ":\n");
        System.out.println(aluno.getDisciplinas());


        //Quantidade de alunos em uma disciplina
        System.out.println("\nQuantidade de alunos na disciplina " + disciplina.getNome() + ":");
        System.out.println(alunocontrole.quantidadeAlunos(disciplina));

        //Cadastrar professor na disciplina
        controleprofessor.cadastrarProfessor(p, disciplina);
        controleprofessor.cadastrarProfessor(p, disciplina1);

        System.out.println("\n----------DADOS DO PROFESSOR----------\n");

        //Disciplinas do professor
        p.disciplinasProfessor();

        //Horário do professor
        System.out.println("\nHorário do(a) professor(a) " + p.nome + ":\n");
        System.out.println(p.getDisciplinas());
    }

}
