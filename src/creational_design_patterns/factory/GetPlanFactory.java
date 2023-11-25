package creational_design_patterns.factory;

public class GetPlanFactory {
    //use getPlan method to get object of type Plan
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equals("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if (planType.equals("INDIVIDUALPLAN")) {
            return new IndividualPlan();
        } else if (planType.equals("DOMESTICPLAN")) {
            return new DomesticPlan();
        }
        return null;
    }
}
