package aulas_backend.aulas.aula0814.getters_setters;

public class ContaCorrenteTest {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        conta1.setTitular("Bruno");
        conta1.depositar(200);
        conta1.mostrarInfo();

        System.out.println();

        ContaCorrente conta2 = new ContaCorrente("Bruno 2", 1);
        conta1.depositar(100);
        conta2.mostrarInfo();
    }
}
