package aulas_backend.aulas.aula0904.interfaces;

public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando...");
    }
}
