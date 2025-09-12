package aulas_backend.menu.aula0821;

import aulas_backend.menu.aula0821.lista_encadeada.ListaEncadeadaItemAction;
import aulas_backend.menu.aula0821.vetor_ordenado.VetorOrdenadoItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.AbstractMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;

import java.util.List;

public class Aula0821Menu extends AbstractMenu {

    @Override
    public String getMenuTitle() {
        return "Aula 21/08 - Instruções de Controle";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Vetor Ordenado", new VetorOrdenadoItemAction()),
                new MenuItem("2", "Lista Encadeada", new ListaEncadeadaItemAction())
        );
    }
}
