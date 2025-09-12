package aulas_backend.menu.aula0828.heranca;

import io.github.brunomonteirobonifacio.simplemenu.menu.AbstractMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;

import java.util.List;

public class HerancaMenu extends AbstractMenu {

    @Override
    public String getMenuTitle() {
        return "Herança";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Exercício com Animal", new ExercicioAnimalItemAction()),
                new MenuItem("2", "Exercício com Veículo", new ExercicioVeiculoHerancaItemAction())
        );
    }
}
