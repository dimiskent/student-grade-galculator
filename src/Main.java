public class Main {
    public static void main(String[] args) {
        IntegerTools tools = new IntegerTools();
        System.out.println("Please input the number of subjects!");
        // Change array length to number of subjects.
        // Process each subject by getting a score and storing it on the array
        tools.addSubjectScores();
        // Take the subjects array and perform arithmetics
        tools.printResults();
        // finally, close the scanner and we're good
        tools.closeUserInput();
    }
}
