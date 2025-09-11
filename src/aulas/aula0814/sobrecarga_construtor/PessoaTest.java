package aulas.aula0814.sobrecarga_construtor;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoaSemArgs = new Pessoa();
        Pessoa pessoaComNome = new Pessoa("Ana");
        Pessoa pessoaNomeIdade = new Pessoa("Carlos", 25);

        pessoaSemArgs.exibir();
        pessoaComNome.exibir();
        pessoaNomeIdade.exibir();
    }
}
