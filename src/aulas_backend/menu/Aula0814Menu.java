package aulas_backend.menu;

import aulas_backend.aula0814.getters_setters.GettersSettersItemAction;
import aulas_backend.aula0814.gradebook.GradebookItemAction;
import aulas_backend.aula0814.pratica3.Pratica03ProdutoItemAction;
import aulas_backend.aula0814.pratica4.Pratica04ConversorItemAction;
import aulas_backend.aula0814.sobrecarga_construtor.SobrecargaConstrutorItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.AbstractMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;

import java.util.List;

public class Aula0814Menu extends AbstractMenu {

    @Override
    public String getMenuTitle() {
        return "Aula 14/08 - Introdução a Classes e Objetos";
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
