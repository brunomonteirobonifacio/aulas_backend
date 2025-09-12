package aulas_backend.menu.aula0807;

import io.github.brunomonteirobonifacio.simplemenu.menu.AbstractMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import aulas_backend.menu.aula0807.instanciando_classe.InstanciandoClasseItemAction;
import aulas_backend.menu.aula0807.utilizando_scanner.UtilizandoScannerItemAction;

import java.util.List;

public class Aula0807Menu extends AbstractMenu {

    @Override
    public String getMenuTitle() {
        return "Aula 07/08 - Introdução ao Java";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Instanciando Classe", new InstanciandoClasseItemAction()),
                new MenuItem("2", "Utilizando Scanner", new UtilizandoScannerItemAction())
        );
    }
}
