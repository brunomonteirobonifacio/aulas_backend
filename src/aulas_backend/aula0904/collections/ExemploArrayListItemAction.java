package aulas_backend.aula0904.collections;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayListItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Nomezão");

        System.out.println("Lista nomes: " + nomes);

        nomes.remove("Nomezão");
        System.out.println("Após remoção: " + nomes);
    }
}
