package aulas_backend.menu.aula0814.pratica3;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class Pratica03ProdutoItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        Produto produto1 = new Produto();
        produto1.exibirInfo();

        Produto produto2 = new Produto("Jato", 2000);
        produto2.exibirInfo();

        Produto produto3 = new Produto("mouse", 120, 1);
        produto3.exibirInfo();
    }
}
