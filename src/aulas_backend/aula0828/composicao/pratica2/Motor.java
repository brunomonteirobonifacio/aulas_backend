package aulas_backend.aula0828.composicao.pratica2;

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
