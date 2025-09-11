package aulas_backend.menu.aula0828.polimorfismo;

import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import aulas_backend.menu.AbstractMenuBr;

import java.util.List;

public class PolimorfismoMenu extends AbstractMenuBr {

    @Override
    public String getMenuTitle() {
        return "Polimorfismo";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Exercício com Formas", new ExercicioFormasPolimorfismoItemAction()),
                new MenuItem("2", "Prática 03", new Pratica03PolimorfismoItemAction())
        );
    }
}
