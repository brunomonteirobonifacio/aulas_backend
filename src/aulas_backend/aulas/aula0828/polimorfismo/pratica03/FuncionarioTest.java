package aulas_backend.aulas.aula0828.polimorfismo.pratica03;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Bruno", 2500);
        System.out.printf("Bonus do funcionario %s: %s\n", funcionario.getNome(), funcionario.calcularBonus());

        Funcionario gerente = new Gerente("Lucas", 10000);
        System.out.printf("Bonus do gerente %s: %s\n", gerente.getNome(), gerente.calcularBonus());


        Funcionario vendedor = new Vendedor("Roger", 2500);
        System.out.printf("Bonus do vendedor %s: %s\n", vendedor.getNome(), gerente.calcularBonus());
    }
}
