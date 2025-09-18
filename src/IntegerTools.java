import java.util.Scanner;
import java.util.Arrays;

public class IntegerTools {
    private Scanner scanner;
    private int[] subjects = {};

    public void addSubjectScores() {
        subjects = Arrays.copyOf(subjects, this.getIntFromUser());
        for (int subject = 0; subject <= (subjects.length-1); subject++) {
            System.out.println("Adding for Subject " + (subject+1) + " (n/100)");
            subjects[subject] = getIntFromUser();
        }
    }
    public void printResults() {
        System.out.println("--------------------------");
        int totalScore = 0;
        for (int subject = 0; subject <= (subjects.length-1); subject++) {
            totalScore += subjects[subject];
        }
        // Round
        int average = (int)Math.round((double)totalScore/subjects.length);
        System.out.println("Total score: " + totalScore + "/" + subjects.length*100);
        System.out.println("Average: " + average + "/100");
        System.out.printf("Grade: %c", scoreToNote(average));
    }
    private char scoreToNote(int score) {
        char grade;
        if(score >= 80) {
            grade = 'A';
        } else if(score >= 60) {
            grade = 'B';
        } else if(score >= 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        return grade;
    }
    // Constructor, starts the scanner.
    public IntegerTools() {
        this.scanner = new Scanner(System.in);
    }
    private int getIntFromUser() {
        while(true) {
            System.out.print("Enter a number: ");
            if(scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                scanner.next();
                System.out.println("Please input a WHOLE number!");
            }
        }
    }
    public void closeUserInput() {
        scanner.close();
    }
}
