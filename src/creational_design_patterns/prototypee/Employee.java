package creational_design_patterns.prototypee;

public class Employee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "creational_design_patterns.prototypee.prototypee.creational_design_patterns.prototypee.Employee{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private String name;
    private String role;

}
