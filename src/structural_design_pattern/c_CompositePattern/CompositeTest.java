package structural_design_pattern.c_CompositePattern;

public class CompositeTest {
    public static void main(String[] args) {
        Component hd = new Leaf(3000, "HDD");
        Component mouse = new Leaf(1000, "mouse");
        Component monitor = new Leaf(2000, "monitor");
        Component ram = new Leaf(1500, "ram");
        Component cpu = new Leaf(5000, "cpu");

        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("cabinet");
        Composite mb = new Composite("mb");
        Composite computer = new Composite("computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        ph.showPrice();
    }
}
