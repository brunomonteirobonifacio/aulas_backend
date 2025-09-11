package aulas_backend.aulas.aula0807_introducao_java.utilizando_scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Nome: " + nome + " - Idade: " + idade);
        }
    }
}