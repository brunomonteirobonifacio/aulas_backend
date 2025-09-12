package aulas_backend.aula0828.composicao.exercicio_carro_composicao;

public class Carro {
    protected Motor motor;

    public Carro() {
        this.motor = new Motor();
    }

    public void dirigir() {
        motor.ligar();
        System.out.println("Carro em movimento...");
    }
}
