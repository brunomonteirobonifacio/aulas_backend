package aulas_backend.aula0814.getters_setters;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class GettersSettersItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        ContaCorrente conta1 = new ContaCorrente();
        conta1.setTitular("Bruno");
        conta1.depositar(200);
        conta1.mostrarInfo();

        System.out.println();

        ContaCorrente conta2 = new ContaCorrente("Bruno 2", 1);
        conta1.depositar(100);
        conta2.mostrarInfo();
    }
}
