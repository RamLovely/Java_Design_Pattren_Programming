package structural_design_pattern.e_proxyPattern;

import sun.font.CreatedFontTracker;

public class ProxyInternetAccess implements OfficeInternetAccess {
    private String employeeName;
    private RealInternetAccess internetAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getRole(String employeeName) {
        return 9;
    }

    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName) > 4) {
            internetAccess = new RealInternetAccess(employeeName);
            internetAccess.grantInternetAccess();
        } else {
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }
}
