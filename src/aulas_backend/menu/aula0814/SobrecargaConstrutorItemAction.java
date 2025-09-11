package aulas_backend.menu.aula0814;

import aulas_backend.aulas.aula0814.sobrecarga_construtor.PessoaTest;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class SobrecargaConstrutorItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        PessoaTest.main(null);
    }
}
