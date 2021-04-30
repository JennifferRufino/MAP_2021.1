package setor.financeiro;

import java.util.ArrayList;

public class Financeiro {
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Conta> contas;

    public Financeiro() {
        this.funcionarios = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public ArrayList<Conta> getDividas() {
        return this.contas;
    }
    public ArrayList<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }
    public void cadastrarConta(String nome, double debito, double credito) {
        Conta novaDivida = new Conta(nome, debito, credito);
        this.contas.add(novaDivida);
    }

    public void cadastrarFuncionario(String nome, double salario) {
        Funcionario novoFuncionario = new Funcionario(nome, salario);
        this.funcionarios.add(novoFuncionario);
    }

    public void mostrarBalanco() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public void mostrarFolhaDePagamentos() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

}
