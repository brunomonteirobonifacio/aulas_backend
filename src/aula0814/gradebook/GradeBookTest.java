package aula0814.gradebook;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            GradeBook gradeBook = new GradeBook();

            System.out.print("Digite o nome do curso");
            String courseName = scanner.nextLine();
            gradeBook.showMessage(courseName);
        }
    }
}
