package aulas_backend.aulas.aula0904.interfaces.pratica02;

public class Boleto implements Pagamento {
    @Override
    public String getDescricao() {
        return "Boleto";
    }

    @Override
    public void pagar(double valor) {
        System.out.printf("R$%.2f pagos com boleto\n", valor);
    }
}
