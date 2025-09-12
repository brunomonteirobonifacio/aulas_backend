package aulas_backend.menu.aula0814.gradebook;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class GradebookItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        GradeBook gradeBook = new GradeBook();

        String courseName = menuEngine.promptString("Digite o nome do curso: ");
        gradeBook.showMessage(courseName);
    }
}
