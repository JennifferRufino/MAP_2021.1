package sistema;

import filme.Filme;
import funcionarios.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class ControleSistema {
    private List<Filme> filmes;
    private List<Funcionario> funcionarios;

    public ControleSistema() {
        this.filmes = new ArrayList<Filme>();
        this.funcionarios = new ArrayList<Funcionario>();
    }

    /**
     * Cadastra um funcionário no filme
     *
     * @param funcionario
     * @return true se conseguir cadastrar o funcionário, caso contrário false
     */
    public boolean cadastrarFuncionario(Filme filme, Funcionario funcionario) {
        if (!filme.getFuncionarios().contains(funcionario)) {
            funcionarios.add(funcionario);
            filme.setFuncionarios(funcionarios);
            filmes.add(filme);
            return true;
        }
        return false;
    }

    /**
     * Mostra o filme e a respectiva função do funcionário
     *
     * @param nome
     * @return o resultado com a função e o filme
     */
    public String filmografia(String nome) {
        String resultado = "";

        int i = 0;

        for (Filme film : filmes) {
            for (Funcionario func : funcionarios) {
                if (func.getNome().equals(nome) && film.getFuncionarios().get(i).getNome().equals(nome)) {
                    resultado = func.getFuncao() + " em: " + film.getNome();
                }
            }
            i++;
        }
        return resultado;
    }

    /**
     * Verifica se um filme está cadastrado, caso esteja mostra seus dados
     *
     * @param filme
     * @return o resultado com os dados
     */
    public String caracteristicas(Filme filme) {
        String resultado = "";

        if (filmes.contains(filme)) {
            resultado = filme.toString();
        }
        return resultado;
    }
}
