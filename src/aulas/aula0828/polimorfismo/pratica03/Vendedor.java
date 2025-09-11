package aulas.aula0828.polimorfismo.pratica03;

public class Vendedor extends Funcionario {
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.1;
    }
}
