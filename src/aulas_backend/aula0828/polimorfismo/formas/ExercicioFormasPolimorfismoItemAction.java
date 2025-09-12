package aulas_backend.aula0828.polimorfismo.formas;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ExercicioFormasPolimorfismoItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        Forma forma = new Forma();
        forma.desenhar();

        Circulo circulo = new Circulo();
        circulo.desenhar();

        Quadrado quadrado = new Quadrado();
        quadrado.desenhar();
    }
}
