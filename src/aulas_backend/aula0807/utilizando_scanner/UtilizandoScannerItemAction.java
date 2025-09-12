package aulas_backend.aula0807.utilizando_scanner;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class UtilizandoScannerItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        String nome = menuEngine.promptString("Digite seu nome: ");
        int idade = menuEngine.promptInt("Digite sua idade: ");

        System.out.println("Nome: " + nome + " - Idade: " + idade);
    }
}
