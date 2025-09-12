package aulas_backend.menu.aula0828.heranca.veiculo;

public class Veiculo {
    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("O veículo " + modelo + " está ligado.");
    }
}
