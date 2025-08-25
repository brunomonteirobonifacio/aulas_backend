package aula0821.lista_encadeada;

public class ListaEncadeadaSimples<T> {
    private No<T> primeiro;

    public void inserirInicio(T valor) {
        No<T> novo = new No<>(valor);
        novo.setProximo(primeiro);
        primeiro = novo;
    }

    public void mostrar() {
        if (primeiro == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        No<T> atual = primeiro;
        while (atual != null) {
            System.out.println(atual.getValor());
            atual = atual.getProximo();
        }
    }
}
