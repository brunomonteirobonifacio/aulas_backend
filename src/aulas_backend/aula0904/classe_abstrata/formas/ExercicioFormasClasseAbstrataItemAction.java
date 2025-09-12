package aulas_backend.aula0904.classe_abstrata.formas;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ExercicioFormasClasseAbstrataItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        Forma quadrado = new Quadrado(3);
        Forma circulo = new Circulo(2);

        System.out.printf("Área do quadrado: %.2f\n", quadrado.calcularArea());
        System.out.printf("Área do círculo: %.2f\n", circulo.calcularArea());
    }
}
