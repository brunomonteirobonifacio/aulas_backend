package menu.aula0828.composicao;

import aulas.aula0828.composicao.pratica02.CarroTest;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class Pratica02ComposicaoItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        CarroTest.main(null);
    }
}
