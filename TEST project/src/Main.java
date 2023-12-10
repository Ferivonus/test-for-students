import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String firstName = scanner.next();
        System.out.print("Enter your surname: ");
        String lastName = scanner.next();
        System.out.print("Enter your school number: ");
        int schoolNumber = scanner.nextInt();
        Students student = new Students(firstName, lastName, schoolNumber);

        Test test = new Test();
        test.readQuestionsFromFile("questions.txt");
        test.readAllAnswersFromFile("All_answers.txt");
        test.readCorrectAnswersFromFile("correct_answers.txt");
        test.runTest();

        scanner.close();
    }
}
