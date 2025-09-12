package aulas_backend.menu.aula0814.sobrecarga_construtor;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class SobrecargaConstrutorItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        Pessoa pessoaSemArgs = new Pessoa();
        Pessoa pessoaComNome = new Pessoa("Ana");
        Pessoa pessoaNomeIdade = new Pessoa("Carlos", 25);

        pessoaSemArgs.exibir();
        pessoaComNome.exibir();
        pessoaNomeIdade.exibir();
    }
}
