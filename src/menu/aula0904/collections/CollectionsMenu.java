package menu.aula0904.collections;

import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import menu.AbstractMenuBr;

import java.util.List;

public class CollectionsMenu extends AbstractMenuBr {

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
