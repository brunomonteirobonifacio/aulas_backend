package aulas_backend.menu.aula0904.classe_abstrata;

import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import aulas_backend.menu.AbstractMenuBr;

import java.util.List;

public class ClasseAbstrataMenu extends AbstractMenuBr {

    @Override
    public String getMenuTitle() {
        return "Classes Abstratas";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Exercício com Formas", new ExercicioFormasClasseAbstrataItemAction()),
                new MenuItem("2", "Prática 01", new Pratica01ClasseAbstrataItemAction())
        );
    }
}
