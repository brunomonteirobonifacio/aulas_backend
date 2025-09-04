package aula0904.interfaces.pratica02;

public class AppFinanceiro {
    public static void main(String[] args) {
        Pagamento pix = new Pix();
        System.out.printf("Pagando com %s:\n", pix.getDescricao());
        pix.pagar(59.99);

        System.out.println();

        Pagamento cartaoCredito = new CartaoCredito();
        System.out.printf("Pagando com %s:\n", cartaoCredito.getDescricao());
        cartaoCredito.pagar(45.8);

        System.out.println();

        Pagamento boleto = new Boleto();
        System.out.printf("Pagando com %s:\n", boleto.getDescricao());
        boleto.pagar(25);
    }
}
