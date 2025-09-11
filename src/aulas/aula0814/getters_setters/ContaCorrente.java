package aulas.aula0814.getters_setters;

public class ContaCorrente {
    private String titular;
    private int numeroConta;
    private double saldo = 0;
    private double limite = 5000;

    public ContaCorrente() {
    }

    public ContaCorrente(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void mostrarInfo() {
        System.out.println("Nome do titular: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        emitirSaldo();
        System.out.printf("Limite: R$%.2f\n", limite);
    }

    public void emitirSaldo() {
        System.out.printf("Saldo: R$%.2f\n", saldo);
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
}
