package aulas_backend.aula0814.pratica3;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this(nome, preco, 0);
    }

    public Produto() {
        this("Sem nome", 0, 0);
    }

    public void exibirInfo() {
        System.out.printf("Nome: %s - Preço: R$%.2f - Quantidade: %s\n", nome, preco, quantidade);
    }
}
