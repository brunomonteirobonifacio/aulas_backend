package aulas.aula0821.lista_encadeada;

public class No<T> {
    private final T valor;
    private No<T> proximo;

    public No(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public boolean isTemProximo() {
        return proximo != null;
    }
}
