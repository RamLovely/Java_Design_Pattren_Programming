package structural_design_pattern.b_BridgePattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        QuestionFormat questionFormat = new QuestionFormat("Java Programming Language");
        questionFormat.question = new JavaQuestions();
        questionFormat.deleteQuestion("what is class?");
        questionFormat.displayQuestion();
        questionFormat.newQuestion("What is inheritance?");
        questionFormat.newQuestion("How many types of inheritance are there in java?");
        questionFormat.displayAll();
    }
}
