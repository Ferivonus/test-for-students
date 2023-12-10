import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    private final char[] correctAnswers = new char[10];
    private final String[] questions = new String[10];
    private final String[][] AllAnswers = new String[10][4];

    public void readQuestionsFromFile(String filename) {
        try {
            String path = "C:/Users/fahre/source/repos/test-for-students/TEST project/test/" + filename;
            BufferedReader reader = new BufferedReader(new FileReader(path));
            for (int i = 0; i < 10; i++) {
                questions[i] = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException("Unable to open file: " + filename);
        }
    }

        try {
            String path = "C:/Users/fahre/source/repos/test-for-students/TEST project/test/" + filename;
            BufferedReader reader = new BufferedReader(new FileReader(path));
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 4; j++) {
                    AllAnswers[i][j] = reader.readLine();
                }
                if (i != 9) {
                    reader.readLine();
                }
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException("Unable to open file: " + filename);
        }
    }

    public void readCorrectAnswersFromFile(String filename) {
        try {
            String path = "C:/Users/fahre/source/repos/test-for-students/TEST project/test/" + filename;
            BufferedReader reader = new BufferedReader(new FileReader(path));
            for (int i = 0; i < 10; i++) {
                String line = reader.readLine();
                correctAnswers[i] = line.charAt(0);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException("Unable to open file: " + filename);
        }
    }

    public void runTest() {
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(AllAnswers[i][j]);
            }
            System.out.println();
            System.out.print("Enter your answer (A, B, C, or D): ");
            char answer = scanner.next().toUpperCase().charAt(0);
            if (answer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + ".");
            }
        }
        System.out.println("\nYour score is " + score + " out of 10.");
        scanner.close();
    }
}
