package aulas_backend.aulas.aula0828.polimorfismo;

public class FormaTest {
    public static void main(String[] args) {
        Forma forma = new Forma();
        forma.desenhar();

        Circulo circulo = new Circulo();
        circulo.desenhar();

        Quadrado quadrado = new Quadrado();
        quadrado.desenhar();
    }
}
