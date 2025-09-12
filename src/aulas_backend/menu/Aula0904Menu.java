package aulas_backend.menu;

import io.github.brunomonteirobonifacio.simplemenu.menu.AbstractMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.OpenMenuAction;

import java.util.List;

public class Aula0904Menu extends AbstractMenu {

    @Override
    public String getMenuTitle() {
        return "Aula 04/09 - Orientação a Objetos II";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Classes Abstratas", new OpenMenuAction(new ClasseAbstrataMenu())),
                new MenuItem("2", "Interface", new OpenMenuAction(new InterfaceMenu())),
                new MenuItem("3", "Collections API", new OpenMenuAction(new CollectionsMenu()))
        );
    }
}
