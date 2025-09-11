package aulas_backend.aulas.aula0821.vetor_ordenado;

public class VetorOrdenadoTest {
    public static void main(String[] args) {
        VetorOrdenado<Integer> vetorOrdenado = new VetorOrdenado<>(5);

        testInserir(vetorOrdenado);
        System.out.println();
        testPesquisaLinear(vetorOrdenado);
        System.out.println();
        testPesquisaBinaria(vetorOrdenado);
        System.out.println();
        testExcluir(vetorOrdenado);
    }

    public static void testInserir(VetorOrdenado<Integer> vetorOrdenado) {
        vetorOrdenado.inserir(2);
        vetorOrdenado.imprimir();

        System.out.println();

        vetorOrdenado.inserir(7);
        vetorOrdenado.imprimir();

        System.out.println();

        vetorOrdenado.inserir(-512);
        vetorOrdenado.imprimir();

        System.out.println();

        vetorOrdenado.inserir(749);
        vetorOrdenado.imprimir();
    }

    public static void testPesquisaLinear(VetorOrdenado<Integer> vetorOrdenado) {
        System.out.println("Teste pesquisa linear para o valor 2: " + vetorOrdenado.pesquisaLinear(2));
        System.out.println("Teste pesquisa linear para o valor 7: " + vetorOrdenado.pesquisaLinear(7));
        System.out.println("Teste pesquisa linear para o valor 0: " + vetorOrdenado.pesquisaLinear(0));
    }

    public static void testPesquisaBinaria(VetorOrdenado<Integer> vetorOrdenado) {
        System.out.println("Teste pesquisa binária para o valor 2: " + vetorOrdenado.pesquisaBinaria(2));
        System.out.println("Teste pesquisa binária para o valor 7: " + vetorOrdenado.pesquisaBinaria(7));
        System.out.println("Teste pesquisa binária para o valor 0: " + vetorOrdenado.pesquisaBinaria(0));
    }

    public static void testExcluir(VetorOrdenado<Integer> vetorOrdenado) {
        boolean exclusaoBemSucedida = vetorOrdenado.excluir(2);
        System.out.println("Exclusão deve ser bem sucedida: " + exclusaoBemSucedida);
        vetorOrdenado.imprimir();

        exclusaoBemSucedida = vetorOrdenado.excluir(2);
        System.out.println("Exclusão deve ser mal sucedida (já não existe mais o valor no vetor): " + exclusaoBemSucedida);
        vetorOrdenado.imprimir();
    }
}
