package aula0821.lista_encadeada;

public class ListaEncadeadaSimples {
    private No primeiro;

    public void inserirInicio(int valor) {
        No novo = new No(valor);
        novo.setProximo(primeiro);
        primeiro = novo;
    }

    public void mostrar() {
        if (primeiro == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        No atual = primeiro;
        while (atual != null) {
            System.out.println(atual.getValor());
            atual = atual.getProximo();
        }
    }
}
