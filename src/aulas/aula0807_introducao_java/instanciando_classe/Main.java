package aulas.aula0807_introducao_java.instanciando_classe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Pessoa pessoa = new Pessoa();

            System.out.print("Digite seu nome: ");
            pessoa.nome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            pessoa.idade = scanner.nextInt();

            pessoa.falar("Nome: " + pessoa.nome + " - Idade: " + pessoa.idade);
        }
    }
}
