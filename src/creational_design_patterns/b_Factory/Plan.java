package creational_design_patterns.b_Factory;

abstract class Plan {
    protected double rate;

    abstract void getRate();

    //Function to perform some operation
    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
