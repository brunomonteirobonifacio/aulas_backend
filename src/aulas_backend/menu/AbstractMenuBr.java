package aulas_backend.menu;

import io.github.brunomonteirobonifacio.simplemenu.menu.AbstractMenu;

public abstract class AbstractMenuBr extends AbstractMenu {
    @Override
    protected String getExitItemDescription() {
        return "Sair";
    }
}
