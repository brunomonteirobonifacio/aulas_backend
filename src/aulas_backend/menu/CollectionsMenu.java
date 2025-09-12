package aulas_backend.menu;

import aulas_backend.aula0904.collections.ExemploArrayListItemAction;
import aulas_backend.aula0904.collections.ExemploHashMapItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.AbstractMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;

import java.util.List;

public class CollectionsMenu extends AbstractMenu {

    @Override
    public String getMenuTitle() {
        return "Collections API";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Exemplo com ArrayList", new ExemploArrayListItemAction()),
                new MenuItem("2", "Exemplo com HashMap", new ExemploHashMapItemAction())
        );
    }
}
