package menu.aula0814;

import aulas.aula0814.getters_setters.ContaCorrenteTest;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class GettersSettersItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        ContaCorrenteTest.main(null);
    }
}
