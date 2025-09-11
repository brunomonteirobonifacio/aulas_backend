package menu.aula0904.interfaces;

import aulas.aula0904.interfaces.CarroTest;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ExercicioVeiculoInterfaceItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        CarroTest.main(null);
    }
}
