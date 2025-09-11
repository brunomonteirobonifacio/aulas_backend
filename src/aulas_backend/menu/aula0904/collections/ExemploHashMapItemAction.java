package aulas_backend.menu.aula0904.collections;

import aulas_backend.aulas.aula0904.collections.ExemploHashMap;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ExemploHashMapItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        ExemploHashMap.main(null);
    }
}
