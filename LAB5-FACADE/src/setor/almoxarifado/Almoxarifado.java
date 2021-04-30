package setor.almoxarifado;

import java.util.ArrayList;

public class Almoxarifado {
    private ArrayList<Produto> estoque;

    public Almoxarifado() {
        this.estoque = new ArrayList<>();
    }

    public void cadastrarProduto(String nomeDoProduto, double valorDoProduto) {
        Produto produto = new Produto(nomeDoProduto, valorDoProduto);
        this.estoque.add(produto);
    }

    public void mostrarEstoque() {
        for (Produto produto : estoque) {
            System.out.println(produto);
        }
    }

    public void comprarProduto(String nomeDoProduto, double valorDoProduto) {
        cadastrarProduto(nomeDoProduto, valorDoProduto);
    }

}
