package aulas_backend.aulas.aula0814.pratica3;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.exibirInfo();

        Produto produto2 = new Produto("Jato", 2000);
        produto2.exibirInfo();

        Produto produto3 = new Produto("mouse", 120, 1);
        produto3.exibirInfo();
    }
}
