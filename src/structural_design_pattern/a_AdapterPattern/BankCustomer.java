package structural_design_pattern.a_AdapterPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {

    @Override
    public void getBankDetails() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the account holder name :  ");
            String customerName = bufferedReader.readLine();
            System.out.print("\n");

            System.out.println("Enter the account number  :  ");
            long accountNumber = Long.parseLong(bufferedReader.readLine());
            System.out.print("\n");

            System.out.println("Enter the bank name  :  ");
            String bankName = bufferedReader.readLine();

            setBankName(bankName);
            setAccNumber(accountNumber);
            setAccHolderName(customerName);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long acNum = getAccNumber();
        String bankName = getBankName();
        String accHolderName = getAccHolderName();

        return ("The account number : " + acNum + "  of  : " + accHolderName + " in : " + bankName + " bank is valid and authenticated for issuing the credit card.");
    }
}
