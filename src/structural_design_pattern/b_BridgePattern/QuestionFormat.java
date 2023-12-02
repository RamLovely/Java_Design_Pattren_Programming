package structural_design_pattern.b_BridgePattern;

public class QuestionFormat extends QuestionManager {
    public QuestionFormat(String catalog) {
        super(catalog);
    }

    public void displayAll() {
        System.out.println("\n---------------------------------------------------------");
        super.displayAllQuestions();
        System.out.println("-----------------------------------------------------------");
    }
}
