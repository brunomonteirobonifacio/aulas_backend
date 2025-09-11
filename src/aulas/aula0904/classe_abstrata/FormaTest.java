package aulas.aula0904.classe_abstrata;

public class FormaTest {
    public static void main(String[] args) {
        Forma quadrado = new Quadrado(3);
        Forma circulo = new Circulo(2);

        System.out.printf("Área do quadrado: %.2f\n", quadrado.calcularArea());
        System.out.printf("Área do círculo: %.2f\n", circulo.calcularArea());
    }
}
