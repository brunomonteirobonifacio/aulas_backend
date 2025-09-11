package aulas_backend.menu.aula0828.composicao;

import aulas_backend.aulas.aula0828.composicao.CarroTest;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ExercicioCarroPolimorfismoItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        CarroTest.main(null);
    }
}
