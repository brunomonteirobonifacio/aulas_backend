package menu.aula0814;

import aulas.aula0814.pratica3.ProdutoTest;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class Pratica03ProdutoItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        ProdutoTest.main(null);
    }
}
