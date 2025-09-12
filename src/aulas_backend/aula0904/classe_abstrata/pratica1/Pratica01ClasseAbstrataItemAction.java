package aulas_backend.aula0904.classe_abstrata.pratica1;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class Pratica01ClasseAbstrataItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
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
