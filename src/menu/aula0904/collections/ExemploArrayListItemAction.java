package menu.aula0904.collections;

import aulas.aula0904.collections.ExemploArrayList;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ExemploArrayListItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        ExemploArrayList.main(null);
    }
}
