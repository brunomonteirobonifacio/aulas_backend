package menu.aula0814;

import aulas.aula0814.pratica4.ConversorTest;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class Pratica04ItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        ConversorTest.main(null);
    }
}
