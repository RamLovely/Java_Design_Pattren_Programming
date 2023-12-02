package structural_design_pattern.b_BridgePattern;

public class QuestionManager {
    protected Question question;
    private String catalog;

    public QuestionManager(String catalog) {
        this.catalog = catalog;
    }

    public void nextQuestion() {
        question.nextQuestion();
    }

    public void previousQuestion() {
        question.previousQuestion();
    }

    public void newQuestion(String q) {
        question.newQuestion(q);
    }

    public void deleteQuestion(String q) {
        question.deleteQuestion(q);
    }

    public void displayQuestion() {
        question.displayQuestion();
    }

    public void displayAllQuestions() {
        System.out.println("Question Paper: " + catalog);
        question.displayAllQuestions();
    }
}
