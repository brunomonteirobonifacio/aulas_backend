package menu.aula0904.interfaces;

import aulas.aula0904.interfaces.pratica02.AppFinanceiro;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class Pratica02InterfaceItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        AppFinanceiro.main(null);
    }
}
