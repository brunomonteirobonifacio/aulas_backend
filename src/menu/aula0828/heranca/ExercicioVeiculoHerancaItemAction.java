package menu.aula0828.heranca;

import aulas.aula0828.heranca.veiculo.VeiculoTest;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ExercicioVeiculoHerancaItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        VeiculoTest.main(null);
    }
}
