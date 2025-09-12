package aulas_backend.aula0821.vetor_ordenado;

public class VetorOrdenado<T extends Comparable<T>> {
    private int capacidade;
    private int ultimaPosicao = -1;
    private T[] valores;

    public VetorOrdenado(int capacidade) {
        this.capacidade = capacidade;
        this.valores = (T[]) new Comparable[capacidade];
    }

    public void imprimir() {
        if (ultimaPosicao < 0) {
            System.out.println("O vetor está vazio");
            return;
        }

        for (int i = 0; i <= ultimaPosicao; i++) {
            System.out.println(i + " - " + valores[i]);
        }
    }

    public void inserir(T valor) {
        if (isCheio()) {
            System.out.println("Capacidade máxima atingida");
            return;
        }

        int posicao = 0;
        for (int i = 0; i <= ultimaPosicao; i++) {
            if (valores[i].compareTo(valor) > 0) {
                break;
            }

            if (i == ultimaPosicao) {
                posicao = i + 1;
            }
        }

        int x = ultimaPosicao;
        while (x >= posicao) {
            valores[x + 1] = valores[x];
            x--;
        }

        valores[posicao] = valor;
        ultimaPosicao++;
    }

    public int pesquisaLinear(T valor) {
        for (int i = 0; i <= ultimaPosicao; i++) {
            if (valores[i].compareTo(valor) > 0) {
                return -1;
            }

            if (valores[i].compareTo(valor) == 0) {
                return i;
            }
        }

        return -1;
    }

    public int pesquisaBinaria(T valor) {
        int limiteInferior = 0;
        int limiteSuperior = ultimaPosicao;

        while (true) {
            int posicaoAtual = (limiteInferior + limiteSuperior) / 2;

            if (valores[posicaoAtual].compareTo(valor) == 0) {
                return posicaoAtual;
            }

            if (limiteInferior > limiteSuperior) {
                return -1;
            }

            if (valores[posicaoAtual].compareTo(valor) < 0) {
                limiteInferior = posicaoAtual + 1;
            } else {
                limiteSuperior = posicaoAtual - 1;
            }
        }
    }

    public boolean excluir(T valor) {
        int posicao = pesquisaLinear(valor);
        if (posicao == -1) {
            return false;
        }

        for (int i = posicao; i < ultimaPosicao; i++) {
            valores[i] = valores[i + 1];
        }

        ultimaPosicao--;

        return true;
    }

    private boolean isCheio() {
        return ultimaPosicao == capacidade - 1;
    }
}
