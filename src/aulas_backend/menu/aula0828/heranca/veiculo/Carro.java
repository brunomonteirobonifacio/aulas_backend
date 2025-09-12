package aulas_backend.menu.aula0828.heranca.veiculo;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String modelo, int ano, int portas) {
        super(modelo, ano);
        this.portas = portas;
    }

    public void abrirPortas() {
        System.out.println("Abrindo " + portas + " portas do carro " + modelo);
    }
}
