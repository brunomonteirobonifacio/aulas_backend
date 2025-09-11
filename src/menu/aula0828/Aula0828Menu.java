package menu.aula0828;

import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.OpenMenuAction;
import menu.AbstractMenuBr;
import menu.aula0828.composicao.ComposicaoMenu;
import menu.aula0828.heranca.HerancaMenu;

import java.util.List;

public class Aula0828Menu extends AbstractMenuBr {

    @Override
    public String getMenuTitle() {
        return "Aula 28/08";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Composição", new OpenMenuAction(new ComposicaoMenu())),
                new MenuItem("2", "Herança", new OpenMenuAction(new HerancaMenu()))
        );
    }
}
