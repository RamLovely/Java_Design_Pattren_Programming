package structural_design_pattern.e_proxyPattern;

public class RealInternetAccess implements OfficeInternetAccess {
    public String employeeName;

    public RealInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: " + employeeName);
    }
}
