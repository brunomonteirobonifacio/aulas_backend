package menu.aula0904;

import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.OpenMenuAction;
import menu.AbstractMenuBr;
import menu.aula0904.classe_abstrata.ClasseAbstrataMenu;
import menu.aula0904.collections.CollectionsMenu;
import menu.aula0904.interfaces.ExercicioVeiculoInterfaceItemAction;

import java.util.List;

public class Aula0904Menu extends AbstractMenuBr {

    @Override
    public String getMenuTitle() {
        return "Aula 04/09";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Classes Abstratas", new OpenMenuAction(new ClasseAbstrataMenu())),
                new MenuItem("2", "Interface", new ExercicioVeiculoInterfaceItemAction()),
                new MenuItem("3", "Collections API", new OpenMenuAction(new CollectionsMenu()))
        );
    }
}
