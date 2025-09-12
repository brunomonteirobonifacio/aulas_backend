package aulas_backend.aula0904.interfaces.exercicio_veiculo;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ExercicioVeiculoInterfaceItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        Veiculo carro = new Carro();

        carro.acelerar();
        carro.frear();
    }
}
