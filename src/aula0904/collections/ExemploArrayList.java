package aula0904.collections;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Nomezão");

        System.out.println("Lista nomes: " + nomes);

        nomes.remove("Nomezão");
        System.out.println("Após remoção: " + nomes);
    }
}
