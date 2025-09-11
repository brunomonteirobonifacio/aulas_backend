package menu.aula0814;

import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import menu.AbstractMenuBr;

import java.util.List;

public class Aula0814Menu extends AbstractMenuBr {

    @Override
    public String getMenuTitle() {
        return "Aula 14/08";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Getters e Setters", new GettersSettersItemAction()),
                new MenuItem("2", "Gradebook", new GradebookItemAction()),
                new MenuItem("3", "Sobrecarga de Construtor", new SobrecargaConstrutorItemAction()),
                new MenuItem("4", "Pratica 03", new Pratica03ProdutoItemAction()),
                new MenuItem("5", "Pratica 04", new Pratica04ConversorItemAction())
        );
    }
}
