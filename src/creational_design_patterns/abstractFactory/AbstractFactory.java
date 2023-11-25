package creational_design_patterns.abstractFactory;

abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
