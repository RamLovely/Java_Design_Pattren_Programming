package creational_design_patterns.d_Prototype;

import java.util.ArrayList;
import java.util.List;

public class Sharpgurus implements Cloneable{
    private String resourceName;
    List<Employee> employeeList = new ArrayList<>();
// write function that perform some operation
    public void loadData(){
        for (int i = 1; i <= 10 ; i++){
            Employee employee = new Employee();
            employee.setName(String.valueOf(i));
            employee.setRole(String.valueOf(i));
            getEmployeeList().add(employee);
        }
    }
    @Override
    public String toString() {
        return "creational_design_patterns.prototypee.prototypee.creational_design_patterns.prototypee.Sharpgurus{" +
                "resourceName='" + resourceName + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
//   noraml cloning
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    // deep cloning
    @Override
    protected Sharpgurus clone() throws CloneNotSupportedException {
        Sharpgurus sharpgurus = new Sharpgurus();
        for(Employee e : getEmployeeList()){
            sharpgurus.getEmployeeList().add(e);
        }
        return sharpgurus;
    }
}
