package aulas_backend.aulas.aula0821.lista_encadeada;

public class ListaEncadeadaSimples<T> {
    private No<T> primeiro;

    public void inserirInicio(T valor) {
        No<T> novo = new No<>(valor);
        novo.setProximo(primeiro);
        primeiro = novo;
    }

    public void mostrar() {
        if (isVazio()) {
            System.out.println("A lista está vazia.");
            return;
        }

        No<T> atual = primeiro;
        while (atual != null) {
            System.out.println(atual.getValor());
            atual = atual.getProximo();
        }
    }

    public No<T> pesquisa(T valor) {
        if (isVazio()) {
            System.out.println("A lista está vazia.");
            return null;
        }

        No<T> atual = primeiro;
        while (!atual.getValor().equals(valor)) {
            if (!atual.isTemProximo()) {
                return null;
            }

            atual = atual.getProximo();
        }

        return atual;
    }

    public No<T> excluirInicio() {
        if (isVazio()) {
            System.out.println("A lista está vazia.");
            return null;
        }

        No<T> oldInicio = primeiro;
        primeiro = primeiro.getProximo();

        return oldInicio;
    }

    public No<T> excluirPosicao(T valor) {
        if (isVazio()) {
            System.out.println("A lista está vazia.");
            return null;
        }

        No<T> noExcluir = primeiro;
        No<T> anterior = primeiro;

        while (!noExcluir.getValor().equals(valor)) {
            if (!noExcluir.isTemProximo()) {
                return null;
            }

            anterior = noExcluir;
            noExcluir = noExcluir.getProximo();
        }

        if (noExcluir == primeiro) {
            primeiro = primeiro.getProximo();
        } else {
            anterior.setProximo(noExcluir.getProximo());
        }

        return noExcluir;
    }

    public boolean isVazio() {
        return primeiro == null;
    }
}
