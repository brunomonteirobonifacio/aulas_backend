package aulas_backend.aulas.aula0904.classe_abstrata.pratica01;

public class AppEmpresa {
    public static void main(String[] args) {
        Funcionario funcionarioCLT = new FuncionarioCLT("Murilo", 2000);
        funcionarioCLT.exibirDados();

        double salarioFinalCLT = funcionarioCLT.calcularSalarioFinal();
        System.out.printf("Salário final CLT: R$%.2f\n", salarioFinalCLT);

        System.out.println();

        Funcionario funcionarioPJ = new FuncionarioPJ("João", 2000);
        funcionarioPJ.exibirDados();

        double salarioFinalPJ = funcionarioPJ.calcularSalarioFinal();
        System.out.printf("Salário final PJ: R$%.2f\n", salarioFinalPJ);
    }
}
