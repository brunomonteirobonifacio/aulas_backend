package menu;

import io.github.brunomonteirobonifacio.simplemenu.menu.Menu;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class MenuEngineBr extends MenuEngine {
    public MenuEngineBr(Menu initialMenu) {
        super(initialMenu);
    }

    @Override
    protected String getOptionSelectionMessage() {
        return "Selecione uma opção: ";
    }

    @Override
    protected String getInvalidOptionSelectedMessage() {
        return "Selecione uma opção válida";
    }
}
