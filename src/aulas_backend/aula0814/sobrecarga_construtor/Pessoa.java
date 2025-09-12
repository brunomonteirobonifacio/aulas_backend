package aulas_backend.aula0814.sobrecarga_construtor;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
        this.nome = "Desconhecido";
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibir() {
        System.out.println("Nome: " + nome + " - Idade: " + idade);
    }
}
