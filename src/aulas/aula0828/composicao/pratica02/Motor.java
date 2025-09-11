package aulas.aula0828.composicao.pratica02;

public class Motor {
    private int potencia;
    private String tipo;

    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public void ligar() {
        System.out.println("Motor ligado!");
    }

    public void desligar() {
        System.out.println("Motor desligado!");
    }
}
