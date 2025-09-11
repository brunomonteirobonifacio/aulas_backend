package aulas_backend.menu.aula0821;

import aulas_backend.aulas.aula0821.vetor_ordenado.VetorOrdenadoTest;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class VetorOrdenadoItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        VetorOrdenadoTest.main(null);
    }
}
