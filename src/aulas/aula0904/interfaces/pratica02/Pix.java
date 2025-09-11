package aulas.aula0904.interfaces.pratica02;

public class Pix implements Pagamento {
    @Override
    public String getDescricao() {
        return "Pix";
    }

    @Override
    public void pagar(double valor) {
        System.out.printf("R$%.2f pagos com Pix\n", valor);
    }
}
