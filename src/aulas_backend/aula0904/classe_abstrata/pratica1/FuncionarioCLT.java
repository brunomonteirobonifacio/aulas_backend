package aulas_backend.aula0904.classe_abstrata.pratica1;

public class FuncionarioCLT extends Funcionario {
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() * 0.9;
    }
}
