package aulas_backend.menu.aula0904.classe_abstrata;

import aulas_backend.aulas.aula0904.classe_abstrata.pratica01.AppEmpresa;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class Pratica01ClasseAbstrataItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        AppEmpresa.main(null);
    }
}
