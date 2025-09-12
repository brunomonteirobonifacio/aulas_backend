package aulas_backend.menu.aula0828.composicao;

import aulas_backend.menu.aula0828.composicao.exercicio_carro_composicao.ExercicioCarroComposicaoItemAction;
import aulas_backend.menu.aula0828.composicao.pratica2.Pratica02ComposicaoItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.AbstractMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;

import java.util.List;

public class ComposicaoMenu extends AbstractMenu {

    @Override
    public String getMenuTitle() {
        return "Composição";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Exercício com Carro e Motor", new ExercicioCarroComposicaoItemAction()),
                new MenuItem("2", "Pratica 02", new Pratica02ComposicaoItemAction())
        );
    }
}
