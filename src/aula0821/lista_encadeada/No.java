package aula0821.lista_encadeada;

public class No {
    private int valor;
    private No proximo;

    public No(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
