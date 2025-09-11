package menu.aula0828.polimorfismo;

import aulas.aula0828.polimorfismo.pratica03.FuncionarioTest;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class Pratica03PolimorfismoItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        FuncionarioTest.main(null);
    }
}
