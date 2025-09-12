package aulas_backend.aula0828.heranca.veiculo;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ExercicioVeiculoHerancaItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        Carro carro = new Carro("Sandero", 2014, 4);
        carro.ligar();
        carro.abrirPortas();

        Moto moto = new Moto("Não sei modelo de moto", 2005, false);
        moto.ligar();
        moto.empinar();
    }
}
