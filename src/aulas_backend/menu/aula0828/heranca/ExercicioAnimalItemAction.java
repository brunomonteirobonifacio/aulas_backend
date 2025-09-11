package aulas_backend.menu.aula0828.heranca;

import aulas_backend.aulas.aula0828.heranca.animal.GatoTest;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ExercicioAnimalItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        GatoTest.main(null);
    }
}
