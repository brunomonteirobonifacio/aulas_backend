package menu.aula0807.instanciando_classe;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class InstanciandoClasseItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = menuEngine.promptString("Digite seu nome: ");
        pessoa.idade = menuEngine.promptInt("Digite sua idade: ");

        pessoa.falar("Nome: " + pessoa.nome + " - Idade: " + pessoa.idade);
    }
}
