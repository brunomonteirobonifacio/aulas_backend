package aulas.aula0828.heranca.veiculo;

public class Moto extends Veiculo {
    private boolean temBagageiro;

    public Moto(String modelo, int ano, boolean temBagageiro) {
        super(modelo, ano);
        this.temBagageiro = temBagageiro;
    }

    public void empinar() {
        System.out.println("A moto " + modelo + " está empinando!");
    }
}
