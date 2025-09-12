package aulas_backend.menu;

import aulas_backend.aula0904.classe_abstrata.formas.ExercicioFormasClasseAbstrataItemAction;
import aulas_backend.aula0904.classe_abstrata.pratica1.Pratica01ClasseAbstrataItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.AbstractMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;

import java.util.List;

public class ClasseAbstrataMenu extends AbstractMenu {

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
