package creational_design_patterns.factory;

public class CommercialPlan extends Plan {
    @Override
    void getRate() {
        rate = 10.50;
    }
}
