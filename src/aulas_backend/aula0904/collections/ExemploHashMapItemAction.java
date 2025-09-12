package aulas_backend.aula0904.collections;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMapItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("Maçã", 50);
        estoque.put("Banana", 30);
        estoque.put("Laranja", 20);

        System.out.println("Estoque inicial: " + estoque);

        System.out.println("Quantidade de maçãs: " + estoque.get("Maçã"));

        estoque.put("Banana", 45);
        System.out.println("Após atualizar bananas: " + estoque);
    }
}
