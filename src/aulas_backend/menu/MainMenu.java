package aulas_backend.menu;

import io.github.brunomonteirobonifacio.simplemenu.menu.AbstractMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.OpenMenuAction;

import java.util.List;

public class MainMenu extends AbstractMenu {

    @Override
    public String getMenuTitle() {
        return "Menu Principal";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Aula 07/08 - Introdução ao Java", new OpenMenuAction(new Aula0807Menu())),
                new MenuItem("2", "Aula 14/08 - Introdução a Classes e Objetos", new OpenMenuAction(new Aula0814Menu())),
                new MenuItem("3", "Aula 21/08 - Instruções de Controle", new OpenMenuAction(new Aula0821Menu())),
                new MenuItem("4", "Aula 28/08 - Orientação a Objetos I", new OpenMenuAction(new Aula0828Menu())),
                new MenuItem("5", "Aula 04/09 - Orientação a Objetos II", new OpenMenuAction(new Aula0904Menu()))
        );
    }
}
