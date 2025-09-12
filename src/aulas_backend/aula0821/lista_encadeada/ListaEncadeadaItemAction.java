package aulas_backend.aula0821.lista_encadeada;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ListaEncadeadaItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine menuEngine) {
        ListaEncadeadaSimples<String> listaEncadeadaSimples = new ListaEncadeadaSimples<>();

        testInserirInicio(listaEncadeadaSimples);
        System.out.println();
        testPesquisa(listaEncadeadaSimples);
        System.out.println();
        testExcluirInicio(listaEncadeadaSimples);
        System.out.println();
        testExcluirPosicao(listaEncadeadaSimples);
    }

    private void testInserirInicio(ListaEncadeadaSimples<String> listaEncadeadaSimples) {
        listaEncadeadaSimples.inserirInicio("B");
        listaEncadeadaSimples.inserirInicio("r");
        listaEncadeadaSimples.inserirInicio("u");
        listaEncadeadaSimples.inserirInicio("n");
        listaEncadeadaSimples.inserirInicio("o");
        listaEncadeadaSimples.inserirInicio("M");
        listaEncadeadaSimples.inserirInicio("B");
        listaEncadeadaSimples.mostrar();
    }

    private void testPesquisa(ListaEncadeadaSimples<String> listaEncadeadaSimples) {
        testPesquisaWithValor(listaEncadeadaSimples, "B");
        testPesquisaWithValor(listaEncadeadaSimples, "r");
        testPesquisaWithValor(listaEncadeadaSimples, "B");
        testPesquisaWithValor(listaEncadeadaSimples, "a");
    }

    private <T> void testPesquisaWithValor(ListaEncadeadaSimples<T> listaEncadeadaSimples, T valor) {
        No<T> noEncontrado = listaEncadeadaSimples.pesquisa(valor);
        System.out.printf("No encontrado para pesquisa de '%s': %s (%s)\n"
                .formatted(valor, noEncontrado != null ? noEncontrado : "Não encontrado", noEncontrado != null ? noEncontrado.getValor() : null));
    }

    private void testExcluirInicio(ListaEncadeadaSimples<String> listaEncadeadaSimples) {
        listaEncadeadaSimples.excluirInicio();
        listaEncadeadaSimples.mostrar();
    }

    private void testExcluirPosicao(ListaEncadeadaSimples<String> listaEncadeadaSimples) {
        listaEncadeadaSimples.excluirPosicao("B");
        listaEncadeadaSimples.mostrar();
        System.out.println();
        listaEncadeadaSimples.excluirPosicao("B");
        listaEncadeadaSimples.mostrar();
    }
}
