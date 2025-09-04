package aula0904.interfaces.pratica02;

public class CartaoCredito implements Pagamento {
    @Override
    public String getDescricao() {
        return "Cartão de Crédito";
    }

    @Override
    public void pagar(double valor) {
        System.out.printf("R$%.2f pagos com cartão de crédito\n", valor);
    }
}
