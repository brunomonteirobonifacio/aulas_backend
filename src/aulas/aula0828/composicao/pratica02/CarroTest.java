package aulas.aula0828.composicao.pratica02;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro("Kwid", new Motor(79, "0.6"));

        carro.ligar();
        carro.desligar();
    }
}
