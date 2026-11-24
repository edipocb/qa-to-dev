package br.com.edipo.fundamentos.semana03;

public class Produto {

    public String nome;
    public double preco;
    public int estoque;

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Estoque: " + estoque);
    }

    public void adicionarEstoque(int quantidade) {
        estoque += quantidade;
    }

    public boolean removerEstoque(int quantidade) {
        if (estoque >= quantidade) {
            estoque -= quantidade;
            return true;
        } else {
            return false;
        }
    }

    public double valorEmEstoque() {
        return preco * estoque;
    }

}
