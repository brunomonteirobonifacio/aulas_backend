package aulas_backend.aula0828.polimorfismo.pratica3;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class Pratica03PolimorfismoItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        Funcionario funcionario = new Funcionario("Bruno", 2500);
        System.out.printf("Bonus do funcionario %s: %s\n", funcionario.getNome(), funcionario.calcularBonus());

        Funcionario gerente = new Gerente("Lucas", 10000);
        System.out.printf("Bonus do gerente %s: %s\n", gerente.getNome(), gerente.calcularBonus());


        Funcionario vendedor = new Vendedor("Roger", 2500);
        System.out.printf("Bonus do vendedor %s: %s\n", vendedor.getNome(), gerente.calcularBonus());
    }
}
