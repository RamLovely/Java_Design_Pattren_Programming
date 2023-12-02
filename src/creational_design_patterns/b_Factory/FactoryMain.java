package creational_design_patterns.b_Factory;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory factory = new OperatingSystemFactory();
        OS os = factory.getInstance("jkjhjhgjhg");
        os.spec();
    }
}
