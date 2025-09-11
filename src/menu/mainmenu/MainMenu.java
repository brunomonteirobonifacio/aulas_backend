package menu.mainmenu;

import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.OpenMenuAction;
import menu.AbstractMenuBr;
import menu.aula0807.Aula0807Menu;

import java.util.List;

public class MainMenu extends AbstractMenuBr {

    @Override
    public String getMenuTitle() {
        return "Menu Principal";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Aula 07/08 - Introdução ao Java", new OpenMenuAction(new Aula0807Menu()))
        );
    }
}
