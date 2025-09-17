import java.util.Scanner;
import java.util.Arrays;

public class IntegerTools {
    private int subjectAmount;
    private Scanner scanner;
    private int[] subjects = {};

    public void addSubjectScores() {
        for (int subject = 0; subject <= (subjectAmount-1); subject++) {
            System.out.println("Adding for Subject " + (subject+1) + " (n/100)");
            subjects[subject] = getIntFromUser();
        }
    }
    public void printResults() {
        System.out.println("--------------------------");
        int totalScore = 0;
        for (int subject = 0; subject <= (subjectAmount-1); subject++) {
            totalScore += subjects[subject];
        }
        // Round
        int average = (int)Math.round((double)totalScore/subjectAmount);
        System.out.println("Total score: " + totalScore + "/" + subjectAmount*100);
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
    public IntegerTools() {
        this.scanner = new Scanner(System.in);
    }
    public void addSubjectAmount() {
        this.subjectAmount = this.getIntFromUser();
        subjects = Arrays.copyOf(subjects, subjectAmount);
    }

    private int getIntFromUser() {
        while(true) {
            System.out.print("Enter a number: ");
            if(scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            scanner.next();
            System.out.println("Please input a WHOLE number!");
        }
    }
    public void closeUserInput() {
        scanner.close();
    }
}
