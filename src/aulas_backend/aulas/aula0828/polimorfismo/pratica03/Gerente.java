package aulas_backend.aulas.aula0828.polimorfismo.pratica03;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.2;
    }
}
