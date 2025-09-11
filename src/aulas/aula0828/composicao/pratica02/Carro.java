package aulas.aula0828.composicao.pratica02;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void ligar() {
        System.out.println("Ligando carro...");
        motor.ligar();
    }

    public void desligar() {
        System.out.println("Desligando carro...");
        motor.desligar();
    }

    public void dirigir() {
        System.out.println("Carro em movimento...");
    }
}
