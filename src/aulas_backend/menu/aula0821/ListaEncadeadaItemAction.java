package aulas_backend.menu.aula0821;

import aulas_backend.aulas.aula0821.lista_encadeada.ListaEncadeadaSimplesTest;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ListaEncadeadaItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        ListaEncadeadaSimplesTest.main(null);
    }
}
