package creational_design_patterns.builder;

public class Samsung extends Company{
    @Override
    public String pack() {
        return "Samsung CD";

    }

    @Override
    public int price() {
        return 15;
    }
}
