package menu.aula0904.interfaces;

import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import menu.AbstractMenuBr;

import java.util.List;

public class InterfaceMenu extends AbstractMenuBr {

    @Override
    public String getMenuTitle() {
        return "Interfaces";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Exercício com Veículo", new ExercicioVeiculoInterfaceItemAction()),
                new MenuItem("2", "Prática 02", new Pratica02InterfaceItemAction())
        );
    }
}
