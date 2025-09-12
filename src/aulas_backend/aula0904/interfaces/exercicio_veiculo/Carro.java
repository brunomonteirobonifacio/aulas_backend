package aulas_backend.aula0904.interfaces.exercicio_veiculo;

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
