package aulas_backend;

import aulas_backend.menu.MenuEngineBr;
import aulas_backend.menu.mainmenu.MainMenu;

public class Main {
    public static void main(String[] args) {
        new MenuEngineBr(new MainMenu()).run();
    }
}
