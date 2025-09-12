package aulas_backend.menu.aula0828.composicao.pratica2;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class Pratica02ComposicaoItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        Carro carro = new Carro("Kwid", new Motor(79, "0.6"));

        carro.ligar();
        carro.desligar();
    }
}
