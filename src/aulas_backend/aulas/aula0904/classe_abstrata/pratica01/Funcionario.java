package aulas_backend.aulas.aula0904.classe_abstrata.pratica01;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void exibirDados() {
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Salário base: R$%.2f\n", salarioBase);
    }

    public abstract double calcularSalarioFinal();
}
