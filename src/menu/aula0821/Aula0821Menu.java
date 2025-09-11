package menu.aula0821;

import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import menu.AbstractMenuBr;

import java.util.List;

public class Aula0821Menu extends AbstractMenuBr {

    @Override
    public String getMenuTitle() {
        return "Aula 21/08";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Vetor Ordenado", new VetorOrdenadoItemAction()),
                new MenuItem("2", "Lista Encadeada", new ListaEncadeadaItemAction())
        );
    }
}
