package aulas_backend.menu.mainmenu;

import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.OpenMenuAction;
import aulas_backend.menu.AbstractMenuBr;
import aulas_backend.menu.aula0807.Aula0807Menu;
import aulas_backend.menu.aula0814.Aula0814Menu;
import aulas_backend.menu.aula0821.Aula0821Menu;
import aulas_backend.menu.aula0828.Aula0828Menu;
import aulas_backend.menu.aula0904.Aula0904Menu;

import java.util.List;

public class MainMenu extends AbstractMenuBr {

    @Override
    public String getMenuTitle() {
        return "Menu Principal";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Aula 07/08 - Introdução ao Java", new OpenMenuAction(new Aula0807Menu())),
                new MenuItem("2", "Aula 14/08", new OpenMenuAction(new Aula0814Menu())),
                new MenuItem("3", "Aula 21/08", new OpenMenuAction(new Aula0821Menu())),
                new MenuItem("4", "Aula 28/08", new OpenMenuAction(new Aula0828Menu())),
                new MenuItem("5", "Aula 04/09", new OpenMenuAction(new Aula0904Menu()))
        );
    }
}
