package aulas.aula0828.heranca.veiculo;

public class VeiculoTest {
    public static void main(String[] args) {
        Carro carro = new Carro("Sandero", 2014, 4);
        carro.ligar();
        carro.abrirPortas();

        Moto moto = new Moto("Não sei modelo de moto", 2005, false);
        moto.ligar();
        moto.empinar();
    }
}
