package aulas_backend;

import aulas_backend.menu.MainMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class Main {
    public static void main(String[] args) {
        new MenuEngine(new MainMenu()).run();
    }
}
