package menu.aula0828.composicao;

import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import menu.AbstractMenuBr;

import java.util.List;

public class ComposicaoMenu extends AbstractMenuBr {

    @Override
    public String getMenuTitle() {
        return "Composição";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Exercício com Carro e Motor", new ExercicioCarroMotorItemAction()),
                new MenuItem("2", "Pratica 02", new Pratica02ItemAction())
        );
    }
}
