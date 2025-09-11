package aulas.aula0828.heranca.animal;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    public void mostrarNome() {
        System.out.println("O nome do gato é " + nome);
    }
}
