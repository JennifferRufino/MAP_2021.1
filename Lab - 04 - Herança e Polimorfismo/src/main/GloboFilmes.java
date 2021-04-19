package main;

import filme.Filme;
import funcionarios.*;
import sistema.ControleSistema;

public class GloboFilmes {
    public static void main(String [] args) {

        Funcionario ator = new Ator("Jayme Matarazzo");
        Funcionario diretor = new Diretor("Jayme Matarazzo");
        //Funcionario diretor = new Diretor("Amora Mautner");
        Funcionario camera = new Camera("Pedro Villarin");
        Funcionario roteirista = new Roteirista("Manuela Dias");

        // Chamando as funções
        ator.getFuncao();
        diretor.getFuncao();
        camera.getFuncao();
        roteirista.getFuncao();

        // Instanciando os filmes
        Filme filme = new Filme("Aquarius", 2016, "146 minutos", "Drama", "1 - Recife Minha Cidade / 2 - Toda Menina Baiana / 3 - Sentimental Demais", ator, diretor, camera, roteirista);

        // Instanciando a classe de controle
        ControleSistema controle = new ControleSistema();

        controle.cadastrarFuncionario(filme, ator);
        controle.cadastrarFuncionario(filme, diretor);
        controle.cadastrarFuncionario(filme, camera);
        controle.cadastrarFuncionario(filme, roteirista);

        System.out.println(controle.caracteristicas(filme));

        System.out.println(controle.filmografia("Jayme Matarazzo"));
    }
}
