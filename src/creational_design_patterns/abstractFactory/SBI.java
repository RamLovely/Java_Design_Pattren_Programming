package creational_design_patterns.abstractFactory;

public class SBI implements Bank{

    private final String BNAME;
    SBI(){
        BNAME = "SBI BANK";
    }
    @Override
    public String getBankName() {
        return BNAME;
    }
}
