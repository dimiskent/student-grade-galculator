public class Main {
    public static void main(String[] args) {
        IntegerTools tools = new IntegerTools();
        System.out.println("Please input the number of subjects!");
        // store subject amount and increment array size to it
        tools.addSubjectAmount();
        // add the scores to the subjects array, then print the results
        tools.addSubjectScores();
        tools.printResults();
        // finally, close the scanner and we're good
        tools.closeUserInput();
    }
}
