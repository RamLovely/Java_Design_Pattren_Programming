package structural_design_pattern.a_AdapterPattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        CreditCard creditCard = new BankCustomer();
        creditCard.getBankDetails();
        System.out.println(creditCard.getCreditCard());
    }
}
