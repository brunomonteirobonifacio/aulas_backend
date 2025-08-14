package aula0814.getters_setters;

public class ContaCorrente {
    private String titular;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void mostrarInfo() {
        System.out.println("Nome do titular: " + titular);
    }
}
