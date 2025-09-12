package aulas_backend.menu.aula0828.heranca.animal;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ExercicioAnimalItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        Gato gato = new Gato("Garfield");
        gato.mostrarNome();
    }
}
