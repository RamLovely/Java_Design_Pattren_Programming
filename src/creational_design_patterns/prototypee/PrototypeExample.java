package creational_design_patterns.prototypee;

public class PrototypeExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sharpgurus sharpgurus = new Sharpgurus();
        sharpgurus.setResourceName("Prasanthi");
        sharpgurus.loadData();


        Sharpgurus sharpgurus1 = sharpgurus.clone();
        sharpgurus.getEmployeeList().remove(2);
        sharpgurus1.setResourceName("Sathish");

        System.out.println(sharpgurus);
        System.out.println(sharpgurus1);
    }
}
