package aulas_backend.menu.aula0828.composicao.exercicio_carro_composicao;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ExercicioCarroComposicaoItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        Carro carro = new Carro();
        carro.dirigir();
    }
}
