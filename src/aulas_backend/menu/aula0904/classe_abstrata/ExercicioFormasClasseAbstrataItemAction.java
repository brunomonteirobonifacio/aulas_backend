package aulas_backend.menu.aula0904.classe_abstrata;

import aulas_backend.aulas.aula0904.classe_abstrata.FormaTest;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ExercicioFormasClasseAbstrataItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        FormaTest.main(null);
    }
}
