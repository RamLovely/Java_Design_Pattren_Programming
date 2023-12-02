package structural_design_pattern.d_DecaratorPattern;

public class VegFood implements Food{
    @Override
    public String prepareFood() {
        return "Veg food";
    }

    @Override
    public double foodPrice() {
        return 70;
    }
}
