package aulas_backend.aula0814.pratica4;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class Pratica04ConversorItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        Conversor conversor = new Conversor();

        double celsius = 20;
        System.out.printf("%.2f°C para Fahrenheit: %.2f°F\n", celsius, conversor.converter(celsius));

        int horas = 2, minutos = 10;
        System.out.printf("%02d:%02d para minutos: %dmin", horas, minutos, conversor.converter(horas, minutos));
    }
}
