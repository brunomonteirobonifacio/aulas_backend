package aulas_backend.aulas.aula0904.classe_abstrata.pratica01;

public class FuncionarioPJ extends Funcionario {
    public FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() * 1.2;
    }
}
