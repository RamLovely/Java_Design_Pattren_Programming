package creational_design_patterns.a_AbstractFactory;

public class ICICI implements Bank{
    private final String BNAME;
    public ICICI(){
        BNAME = "ICICI BANK";
    }
    @Override
    public String getBankName() {
        return BNAME;
    }
}
