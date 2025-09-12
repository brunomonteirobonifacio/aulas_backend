package aulas_backend.menu;

import io.github.brunomonteirobonifacio.simplemenu.menu.AbstractMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.OpenMenuAction;

import java.util.List;

public class Aula0828Menu extends AbstractMenu {

    @Override
    public String getMenuTitle() {
        return "Aula 28/08 - Orientação a Objetos I";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Composição", new OpenMenuAction(new ComposicaoMenu())),
                new MenuItem("2", "Herança", new OpenMenuAction(new HerancaMenu()))
        );
    }
}
